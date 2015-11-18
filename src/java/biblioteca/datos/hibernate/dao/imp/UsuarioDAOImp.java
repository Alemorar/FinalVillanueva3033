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
public class UsuarioDAOImp extends HibernateDaoSupport implements IUsuarioDAO, Serializable{

    @Override
    public void agregarUsuario(Usuario usuario) {
        getHibernateTemplate().save(usuario);
    }
    
}
