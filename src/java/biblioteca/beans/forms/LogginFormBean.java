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
    
    public void validarUsuario(){
        //String resultado = null;
        IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
        Usuario usuario = usuarioDAO.validarUsuario(nombreUsuario, password);
        if(usuario != null){
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario válido", "Usuario válido");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        }else{
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Credenciales invalidas", "Credenciales invalidas");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        }
        //return resultado;
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
