/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ArregloUsuario {
    private ArrayList<Usuario> b; //particulariza a objetos de tipo Producto
  
// constructor
  public ArregloUsuario(){
  b = new ArrayList <Usuario>();
}//Metodos de administracion

   public int getN() { //retorna el numero de objetos guardados
        return getB().size() ;
 }
  
  public void agrega( Usuario u){ // guarda un nuevo producto
  getB().add(u);
}

  public Usuario getUsuario(int i){ // obtiene un producto de la posicion
  return getB().get(i);
}
  
  public void actualiza(Usuario u, int i){ // reemplaza un producto un objeto
        getB().set(i,u);
}
  
  public int busca(String dni){// busca y retorna la posición de un objeto, a través de su codigo
  for(int i=0; i<getN(); i++){
  if(getUsuario(i).getDni().equals(dni))
  return i;
}
  return -1; // no lo encuentra
}
  
  public void elimina(int u){ // elimina el producto de la posición indicada
  getB().remove(u);
}

   
    public ArrayList<Usuario> getB() {
        return b;
    }
  
 
}
