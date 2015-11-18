package biblioteca.datos.hibernate.dao.imp;

import biblioteca.datos.hibernate.dao.ICopiaPeliculaDAO;
import biblioteca.modelo.dominio.CopiaPelicula;
import java.io.Serializable;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class CopiaPeliculaDAOImp extends HibernateDaoSupport implements ICopiaPeliculaDAO, Serializable{

    @Override
    @Transactional
    public void agregarCopiaPelicula(CopiaPelicula copiaPelicula) {
        getHibernateTemplate().save(copiaPelicula);
    }
}
