/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.beans.modelo;

import biblioteca.datos.hibernate.dao.IClienteDAO;
import biblioteca.modelo.dominio.Cliente;
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
public class ClienteBean implements Serializable{
    @ManagedProperty(value = "#{cliente}")
    private Cliente cliente;
    @ManagedProperty(value = "#{clienteDAO}")
    private IClienteDAO clienteDAO;
    
    public ClienteBean() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public IClienteDAO getClienteDAO() {
        return clienteDAO;
    }

    public void setClienteDAO(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
    
}
