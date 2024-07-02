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
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ArchivoVenta extends ArregloVenta{
    protected String nombre;
    public ArchivoVenta(String nombre){
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
                double precio=Double.parseDouble(st.nextToken());
                int cantidad=Integer.parseInt(st.nextToken());
                Venta nuevo=new Venta(codigo, cantidad, precio);
               agrega(nuevo);
                linea=br.readLine();
            }br.close();
        }catch(Exception ex){
            System.out.println("error");
        }
    }
    public void graba(){
        try{
            FileWriter fw=new FileWriter(nombre);
            PrintWriter pw=new PrintWriter(fw);
            for (int i = 0; i < getN(); i++) {
                Venta p=getVenta(i);
                pw.println(p.getCodigo()+"/"+
                            p.getCantidad()+"/"+
                            p.getPrecio()+"/"+
                            p.total());
            }pw.close();
        }catch(Exception ex){
            
        }
    }
}
