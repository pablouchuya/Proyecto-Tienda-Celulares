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
 * @author Usuario
 */        
public class ArchivoUsuario extends ArregloUsuario{
      protected String nombre;

    public ArchivoUsuario(String nombre) {
        super();
        this.nombre = nombre;
        lee();
    }
    public void lee() {
        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                StringTokenizer st = new StringTokenizer(linea, "/");
                String nombre =st.nextToken();
                String apellido=st.nextToken();
                String dni=st.nextToken();
                String usuario=st.nextToken();
                String contraseña=st.nextToken();
                Usuario b = new Usuario(nombre, apellido, dni,usuario, contraseña);
                agrega(b);
                linea = br.readLine();
            }
            br.close();
        } catch (Exception ex) {
        }
    }
    public void graba() {
        try {
            FileWriter fw = new FileWriter(nombre);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < getN(); i++) {
                Usuario f = getUsuario(i);
                
                    pw.println(f.getNombre()+"/"+
                            f.getApellido()+"/"+
                            f.getDni()+"/"+
                            f.getUsuario()+"/"+
                            f.getContraseña());
            }
            pw.close();
        } catch (Exception ex) {
        }
    }
    
   
}