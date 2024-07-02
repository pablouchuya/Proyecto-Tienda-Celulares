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
public class ArregloVenta {
     private ArrayList<Venta> b; //particulariza a objetos de tipo Producto
  
// constructor
  public ArregloVenta(){
  b = new ArrayList <Venta>();
}//Metodos de administracion

   public int getN() { //retorna el numero de objetos guardados
        return getB().size() ;
 }
  
  public void agrega( Venta v){ // guarda un nuevo producto
  getB().add(v);
}

  public Venta getVenta(int i){ // obtiene un producto de la posicion
  return getB().get(i);
}
  
  public void actualiza(Venta v, int i){ // reemplaza un producto un objeto
        getB().set(i,v);
}
  
  public int busca(String Codigo){// busca y retorna la posición de un objeto, a través de su codigo
  for(int i=0; i<getN(); i++){
  if(getVenta(i).getCodigo().equals(Codigo))
  return i;
}
  return -1; // no lo encuentra
}
  
  public void elimina(int u){ // elimina el producto de la posición indicada
  getB().remove(u);
}

   
    public ArrayList<Venta> getB() {
        return b;
    }
    
    
    
}
