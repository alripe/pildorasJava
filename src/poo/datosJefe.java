package poo;

public class datosJefe extends datosEmpleado {
    double bonoExtra;

    public datosJefe(String nombreEmp, double sueldoEmp, int agnoEmp, int mesEmp, int diaEmp) {
        super(nombreEmp, sueldoEmp, agnoEmp, mesEmp, diaEmp);
    }

    public void ingreseBono(double bono) {
        this.bonoExtra = bono;
    }

    public double mostrarBono() {
        return this.bonoExtra;
    }

    public double obtenerSueldo() {
        double sueldoJefes = super.obtenerSueldo();
        return sueldoJefes + this.bonoExtra;
    }
}
