 /* Creacion inicial de documento */
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

/**
 *
 * @author Alejo
 */
public class Empresa {
    /*Creación de atributos: Nombre, Direccion, Telefono y Nit.*/
    private String nombre, direccion,telefono, nit;
    
    /*Método Constructor por defecto*/
    public Empresa(){ 
        
    }
    
    /*Método Constructor con todos los atributos*/
    public Empresa(String nombre, String direccion, String telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }
    /* Métodos Modificadores*/
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public void setNit(String nit) {this.nit = nit;}
    
    /* Métodos accesores*/
    public String getNombre() {return nombre;}
    public String getDireccion() {return direccion;}
    public String getTelefono() {return telefono;}
    public String getNit() {return nit;}
    
    /*Método para mostrar atributos*/
    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", nit=" + nit + '}';
    }
     
}                     