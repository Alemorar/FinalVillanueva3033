/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.datos.hibernate.dao.imp;

import biblioteca.datos.hibernate.dao.IRegistroAlquilerDAO;
import biblioteca.modelo.dominio.RegistroAlquiler;
import java.io.Serializable;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alejandro
 */
public class RegistroAlquilerDAOImp extends HibernateDaoSupport implements IRegistroAlquilerDAO, Serializable {
    @Override
    @Transactional
    public void agregarRegistroAlquiler(RegistroAlquiler registroAlquiler) {
        getHibernateTemplate().save(registroAlquiler);
    }
}
