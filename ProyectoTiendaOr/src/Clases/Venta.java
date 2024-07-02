/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Venta {
    //Atributo
    private String codigo;
    private int cantidad;
    private double precio;
    
    //Constructor
    
    public Venta(String codigo, int cantidad, double precio){
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public double total(){
        return getCantidad()*getPrecio();
    }

   
    public int getCantidad() {
        return cantidad;
    }

    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
}
