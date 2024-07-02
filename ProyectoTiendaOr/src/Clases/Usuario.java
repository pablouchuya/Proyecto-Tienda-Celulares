/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


   
/**
 *
 * @author Usuario
 */
public class Usuario {
    //atributos
    private String nombre,apellido,dni,usuario,contraseña;
    
    //Constructor
    public Usuario(String nombre, String apellido, String dni, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    

  
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getApellido() {
        return apellido;
    }

  
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContraseña() {
        return contraseña;
    }

   
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   
    public String getUsuario() {
        return usuario;
    }

 
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   
  
      
             
        }
    
