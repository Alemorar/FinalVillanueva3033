/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.beans.forms;

import biblioteca.datos.hibernate.dao.IUsuarioDAO;
import biblioteca.datos.hibernate.dao.imp.UsuarioDAOImp;
import biblioteca.modelo.dominio.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author alejandro
 */
@ManagedBean
@RequestScoped
public class LogginFormBean {
    private String nombreUsuario;
    private String password;

    /**
     * Creates a new instance of LogginFormBean
     */
    public LogginFormBean() {
    }
    
    /*Hola la forma en que lo implementas esta correcta, lo que si en el metodo validarUsuario
    del usuarioDaoImp deberias usar un objeto semejante que te permita hacer el where
    para encontrar el usuario en una tabla de una base de datos.
    para esto te paso un codigo que te podria servir (hibernate de Spring),
    no esta testeado pero te lo escribo para que lo revises en base a tus propios datos*/

    /*public Usuario validarUsuario() {
        DetachedCriteria  dc = DetachedCriteria.forClass(Usuario.class);
        dc.add(Restrictions.eq("nombreUsu", "pepe"));
        dc.add(Restrictions.eq("claveUsu", "12345"));
        ArrayList<Usuario> resu = (ArrayList)getHibernateTemplate().findByCriteria(dc);
        
        //aqui deberrias poner condigo para ver si resu es null
        //en este caso no se encontraron usuarios con los parametros de otro modo retornas el primer elemento
        return resu.get(0);
    }*/   

    /*En este caso nombreUsu y claveUsu son propiedades de la clase Usuario, si es que 
    se encuentra un usuario con los datos que pasaste como parametros se retorna el elemento
    en la posición cero de "resu", en caso de que no encuentre usuario, se debería retornar null,
    para que vos lo interpretes en el metodo llamador del formbean.*/

    public String validarUsuario(){
        String resultado = null;
        IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
        Usuario usuario = usuarioDAO.validarUsuario(nombreUsuario, password);
        if(usuario != null){
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario válido", "Usuario válido");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
            
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("Usuario Válido", usuario);
            resultado = "tcClient?faces-redirect=true";
        }else{
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Credenciales Inválidas", "Credenciales Inválidas");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        }
        return resultado;
    }
    
    public String getNombreUsuarioValidado(){
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado");
        return usuario.getNombreUsuario();
    }
    
    public String cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sesion Cerrada", "Sesion Cerrada");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        String resultado = "/index?faces-redirect=true";
        return resultado;
    }
    
    public boolean verificarSesion(){
        boolean sesionValida = false;
        if(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado") != null){
            sesionValida = true;
        }
        return sesionValida;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
