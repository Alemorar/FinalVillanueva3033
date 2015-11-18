    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.modelo.dominio;

/**
 *
 * @author nahuel
 */
public class CopiaPelicula {
    private int codigo;
    private String nombre;
    private String genero;
    private double precioAlquiler;
    private boolean estadoAlquilado;
    private boolean estado;

    public CopiaPelicula() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public boolean isEstadoAlquilado() {
        return estadoAlquilado;
    }

    public void setEstadoAlquilado(boolean estadoAlquilado) {
        this.estadoAlquilado = estadoAlquilado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
