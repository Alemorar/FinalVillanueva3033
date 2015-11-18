package biblioteca.beans.modelo;

import biblioteca.datos.hibernate.dao.IUsuarioDAO;
import biblioteca.modelo.dominio.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class UsuarioBean implements Serializable{
    @ManagedProperty(value = "#{usuario}")
    private Usuario guiaPrecio;
    @ManagedProperty(value = "#{usuarioDAO}")
    private IUsuarioDAO usiarioDAO;
    
    public UsuarioBean() {
    }

    public Usuario getGuiaPrecio() {
        return guiaPrecio;
    }

    public void setGuiaPrecio(Usuario guiaPrecio) {
        this.guiaPrecio = guiaPrecio;
    }

    public IUsuarioDAO getUsiarioDAO() {
        return usiarioDAO;
    }

    public void setUsiarioDAO(IUsuarioDAO usiarioDAO) {
        this.usiarioDAO = usiarioDAO;
    }
    
}
