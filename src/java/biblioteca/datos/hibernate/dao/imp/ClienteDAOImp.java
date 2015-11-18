package biblioteca.datos.hibernate.dao.imp;

import biblioteca.datos.hibernate.dao.IClienteDAO;
import biblioteca.modelo.dominio.Cliente;
import java.io.Serializable;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class ClienteDAOImp extends HibernateDaoSupport implements IClienteDAO, Serializable{

    @Override
    @Transactional
    public void agregarCliente(Cliente cliente) {
        getHibernateTemplate().save(cliente);
    }
    
}
