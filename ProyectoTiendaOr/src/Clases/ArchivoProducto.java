/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author MIGUEL
 */
public class ArchivoProducto extends ArregloProducto{
    protected String nombre;
    public ArchivoProducto(String nombre){
        super();
        this.nombre=nombre;
        lee();
    }
    
    public void lee(){
        try{
            FileReader fr= new FileReader(nombre);
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            while(linea!=null){
                StringTokenizer st=new StringTokenizer(linea,"/");
                String codigo=st.nextToken();
                String tipo=st.nextToken();
                String foto=st.nextToken();
                String marca=st.nextToken();
                String modelo=st.nextToken();
                double precio=Double.parseDouble(st.nextToken());
                String descripcion= st.nextToken();
                String tamaño=st.nextToken();
                Producto nuevo=new Producto(codigo, tipo, foto,new Informacion(marca, modelo, precio, descripcion,tamaño));
               agrega(nuevo);
                linea=br.readLine();
            }br.close();
        }catch(Exception ex){
            
        }
    }
    public void graba(){
        try{
            FileWriter fw=new FileWriter(nombre);
            PrintWriter pw=new PrintWriter(fw);
            for (int i = 0; i < getN(); i++) {
                Producto p=getproducto(i);
                pw.println(p.getCodigo()+"/"+
                            p.getTipo()+"/"+
                            p.getFoto()+"/"+
                            p.getInfo().getMarca()+"/"+
                            p.getInfo().getModelo()+"/"+
                            p.getInfo().getPrecio()+"/"+
                            p.getInfo().getDescripcion()+"/"+
                            p.getInfo().getTamaño());
            }pw.close();
        }catch(Exception ex){
            
        }
    }
}
