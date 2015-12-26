/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.datos.hibernate.dao.imp;

import biblioteca.datos.hibernate.dao.IUsuarioDAO;
import biblioteca.modelo.dominio.Usuario;
import java.io.Serializable;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author alejandro
 */
public class UsuarioDAOImp extends HibernateDaoSupport implements IUsuarioDAO, Serializable {

    @Override
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
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        getHibernateTemplate().save(usuario);
    }
}
