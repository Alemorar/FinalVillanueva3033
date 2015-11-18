/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.beans.modelo;

import biblioteca.datos.hibernate.dao.IRegistroAlquilerDAO;
import biblioteca.modelo.dominio.Cliente;
import biblioteca.modelo.dominio.CopiaPelicula;
import biblioteca.modelo.dominio.RegistroAlquiler;
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
public class RegistroAlquilerBean implements Serializable{
    @ManagedProperty(value = "#{registroAlquiler}")
    private RegistroAlquiler registroAlquiler;
    @ManagedProperty(value = "{registroAlquilerDAO")
    private IRegistroAlquilerDAO registroAlquilerDAO;
    
    public RegistroAlquilerBean() {
        registroAlquiler = new RegistroAlquiler();
        registroAlquiler.setCliente(new Cliente());
        registroAlquiler.setCopiaPelicula(new CopiaPelicula());
    }

    public RegistroAlquiler getRegistroAlquiler() {
        return registroAlquiler;
    }

    public void setRegistroAlquiler(RegistroAlquiler registroAlquiler) {
        this.registroAlquiler = registroAlquiler;
    }

    public IRegistroAlquilerDAO getRegistroAlquilerDAO() {
        return registroAlquilerDAO;
    }

    public void setRegistroAlquilerDAO(IRegistroAlquilerDAO registroAlquilerDAO) {
        this.registroAlquilerDAO = registroAlquilerDAO;
    }
    
}
