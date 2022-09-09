package com.labx.GestionIngresosEgresos.entities;

public class Empleado {
    /*Creación de atributos: Nombre, Correo, Empresa y Rol.*/
    private String nombre, correo,empresa, rol;

    /*Método Constructor por defecto*/
    public Empleado(){

    }

    /*Método Constructor con todos los atributos*/
    public Empleado(String nombre, String correo, String empresa, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }
    /* Métodos Modificadores*/
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCorreo(String correo) {this.correo = correo;}
    public void setEmpresa(String empresa) {this.empresa = empresa;}
    public void setRol(String rol) {this.rol = rol;}

    /* Métodos accesores*/
    public String getNombre() {return nombre;}
    public String getCorreo() {return correo;}
    public String getEmpresa() {return empresa;}
    public String getRol() {return rol;}

    /*Método para mostrar atributos*/
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", correo=" + correo + ", empresa=" + empresa + ", rol=" + rol + '}';
    }
}
