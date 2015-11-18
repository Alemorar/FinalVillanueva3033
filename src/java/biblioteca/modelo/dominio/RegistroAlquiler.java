/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author nahuel
 */
public class RegistroAlquiler implements Serializable{
    private int codigoRegistro;
    private Date fecha;
    private Date fechaDevolucion;
    private double precioFinal;
    private Cliente cliente;
    private CopiaPelicula copiaPelicula;

    public RegistroAlquiler() {
    }

    public RegistroAlquiler(int codigoRegistro, Date fecha, Date fechaDevolucion, double precioFinal, Cliente cliente, CopiaPelicula copiaPelicula) {
        this.codigoRegistro = codigoRegistro;
        this.fecha = fecha;
        this.fechaDevolucion = fechaDevolucion;
        this.precioFinal = precioFinal;
        this.cliente = cliente;
        this.copiaPelicula = copiaPelicula;
    }

    public int getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(int codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CopiaPelicula getCopiaPelicula() {
        return copiaPelicula;
    }

    public void setCopiaPelicula(CopiaPelicula copiaPelicula) {
        this.copiaPelicula = copiaPelicula;
    }
}
