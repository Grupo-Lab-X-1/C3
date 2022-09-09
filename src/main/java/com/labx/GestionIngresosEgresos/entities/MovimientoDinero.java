package com.labx.GestionIngresosEgresos.entities;

import java.time.LocalDate;

public class MovimientoDinero{
    private double monto;
    private String conceptoMovimiento;
    private String usuario;
    private double total = 0;
    private LocalDate fecha;

    // Esta metodo realiza operaciones de INGRESO y EGRESO
    public double gestionMovimientos(){
        if (conceptoMovimiento.equals("ingreso")){
            total += monto;
            return total;
        }
        if (conceptoMovimiento.equals("egreso")){
            total -= monto;
            return total;
        }
        return 0;
    }

    // Constructor vacio
    public MovimientoDinero() {
    }
    // Constructor con parametros
    public MovimientoDinero(double monto, String conceptoMovimiento, String usuario, LocalDate fecha) {
        this.monto = monto;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String sgetConceptoMovimiento() {
        return conceptoMovimiento;
    }
    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public double getTotal() { return total;}

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "monto=" + monto +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", usuario='" + usuario + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}