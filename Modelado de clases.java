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
