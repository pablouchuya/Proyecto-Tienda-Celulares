/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author MIGUEL
 */
public class Producto {
    private String codigo;
    private String tipo;
    private String foto;
    private Informacion info;

    public Producto(String codigo, String tipo, String foto, Informacion info) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.foto = foto;
        this.info = info;
    }

    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public Informacion getInfo() {
        return info;
    }
    public void setInfo(Informacion info) {
        this.info = info;
    }
    
    
}
