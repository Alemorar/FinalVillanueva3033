/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.beans.modelo;

import biblioteca.datos.hibernate.dao.ICopiaPeliculaDAO;
import biblioteca.modelo.dominio.CopiaPelicula;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author alejandro
 */
@ManagedBean
@RequestScoped
public class CopiaPeliculaBean implements Serializable{
    @ManagedProperty(value = "#{copiaPelicula}")
    private CopiaPelicula copiaPelicula;
    @ManagedProperty(value = "#{copiaPeliculaDAO")
    private ICopiaPeliculaDAO copiaPeliculaDAO;
    
    public CopiaPeliculaBean() {
    }

    public CopiaPelicula getCopiaPelicula() {
        return copiaPelicula;
    }

    public void setCopiaPelicula(CopiaPelicula copiaPelicula) {
        this.copiaPelicula = copiaPelicula;
    }

    public ICopiaPeliculaDAO getCopiaPeliculaDAO() {
        return copiaPeliculaDAO;
    }

    public void setCopiaPeliculaDAO(ICopiaPeliculaDAO copiaPeliculaDAO) {
        this.copiaPeliculaDAO = copiaPeliculaDAO;
    }
    
}
