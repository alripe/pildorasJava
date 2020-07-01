package poo;

public class datosJefe extends datosEmpleado {

    double bonoExtra;

    public datosJefe(String nombreEmp, double sueldoEmp, int agnoEmp, int mesEmp, int diaEmp) {
        super(nombreEmp, sueldoEmp, agnoEmp, mesEmp, diaEmp);
    }
    public void ingreseBono(double bono){ //SETTER
        bonoExtra=bono;
    }

    public double mostrarBono(){ //GETTER
        return bonoExtra;
    }

    @Override
    public double obtenerSueldo() {//GETTER
        double sueldoJefes = super.obtenerSueldo();
        return sueldoJefes + bonoExtra;
    }
}