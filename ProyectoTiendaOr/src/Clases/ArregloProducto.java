/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;


public class ArregloProducto {

    private ArrayList<Producto> b; //particulariza a objetos de tipo Producto

// constructor
    public ArregloProducto() {
        b = new ArrayList<Producto>();
    }//Metodos de administracion

    public int getN() { //retorna el numero de objetos guardados
        return getB().size();
    }

    public void agrega(Producto u) { // guarda un nuevo Producto
        getB().add(u);
    }

    public Producto getproducto(int i) { // obtiene un Producto de la posicion
        return getB().get(i);
    }

    public void actualiza(Producto u, int i) { // reemplaza un Producto un objeto
        getB().set(i, u);
    }

    public int busca(String codigo) {// busca y retorna la posición de un objeto, a través de su codigo
        for (int i = 0; i < getN(); i++) {
            if (getproducto(i).getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1; // no lo encuentra
    }

    public void elimina(int u) { // elimina el Producto de la posición indicada
        getB().remove(u);
    }

    public ArrayList<Producto> getB() {
        return b;
    }
    
    
}
