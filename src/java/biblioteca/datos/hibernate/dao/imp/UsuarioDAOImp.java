/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.datos.hibernate.dao.imp;

import biblioteca.datos.hibernate.dao.IUsuarioDAO;
import biblioteca.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author alejandro
 */
public class UsuarioDAOImp extends HibernateDaoSupport implements IUsuarioDAO, Serializable {

    /*@Override
    public Usuario validarUsuario(String nombreUsuario, String password) {
        Usuario u = null;
        boolean esHallado = false;
        for(int i = 0; i < ListadoUsuarios.listadoUsuario.length && esHallado != true; i++){
            Usuario usuarioDelListado = ListadoUsuarios.listadoUsuario[i];
            if(usuarioDelListado != null && usuarioDelListado.getNombreUsuario().equals(nombreUsuario) &&
                    usuarioDelListado.getPassword().equals(password)){
                u = usuarioDelListado;
                esHallado = true;
            }
        }
        return u;
    }*/
    
    /*Hola la forma en que lo implementas esta correcta, lo que si en el metodo validarUsuario
    del usuarioDaoImp deberias usar un objeto semejante que te permita hacer el where
    para encontrar el usuario en una tabla de una base de datos.
    para esto te paso un codigo que te podria servir (hibernate de Spring),
    no esta testeado pero te lo escribo para que lo revises en base a tus propios datos*/
    @Override
    @Transactional
    public Usuario validarUsuario(String nombreUsuario, String password) {
        System.out.println("aca entramos al validar usuario de usuariodaoimpl");
        System.out.println("nombreUsuario " + nombreUsuario +  " password " + password);
        DetachedCriteria  dc = DetachedCriteria.forClass(Usuario.class);
        dc.add(Restrictions.eq("nombreUsu", nombreUsuario));
        dc.add(Restrictions.eq("claveUsu", password));
        System.out.println("usuario " + dc.getAlias());
        System.out.println("aca agregamos restrictions nombreusuario y password deteched criteria");
        ArrayList<Usuario> resu = new ArrayList<Usuario>();
        resu = (ArrayList)getHibernateTemplate().findByCriteria(dc);
        System.out.println("usuariodaoimpl devuelve el array de tipo usuario resu");
        //aqui deberrias poner condigo para ver si resu es null
        //en este caso no se encontraron usuarios con los parametros de otro modo retornas el primer elemento
        if (resu.isEmpty()) {
            System.out.println("Aca devolvemos usuario null");
            return null;            
        }else {
            System.out.println("Aca devolvemos usuario get(0)");
            return resu.get(0);
        }
    }

    /*En este caso nombreUsu y claveUsu son propiedades de la clase Usuario, si es que 
    se encuentra un usuario con los datos que pasaste como parametros se retorna el elemento
    en la posición cero de "resu", en caso de que no encuentre usuario, se debería retornar null,
    para que vos lo interpretes en el metodo llamador del formbean.*/

    @Override
    public void modificarUsuario(Usuario usuario) {
        getHibernateTemplate().save(usuario);
    }
}
