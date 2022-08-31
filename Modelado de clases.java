/* Creacion inicial de documento */
 
 package Sprint2;

public class MovimientoDinero extends Empleado {
    private double monto;
    private String conceptoMovimiento;

    public MovimientoDinero() {
    }

    public MovimientoDinero(double monto, String conceptoMovimiento) {
        this.monto = monto;
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    @Override
    public String toString() {
        return "MovimientoDinero {" +
                "monto=" + monto +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                '}';
    }
}


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
/*Creación de la clase Empleado*/
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