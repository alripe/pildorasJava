package poo;

import java.util.Date;
import java.util.GregorianCalendar;

class datosEmpleado {

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    //metodo Constructor con parametros ----------------------------------------------------------1
    public datosEmpleado(String nombreEmp, double sueldoEmp, int agnoEmp, int mesEmp, int diaEmp){

        nombre=nombreEmp;
        sueldo=sueldoEmp;

        GregorianCalendar calendario = new GregorianCalendar(agnoEmp, mesEmp, diaEmp);
        altaContrato=calendario.getTime();
    }
    //metodo sobrecarga  regresa solo nombre -----------------------------------------------------2
    public datosEmpleado(String nombreEmp){

        this(nombreEmp, 25000, 2010, 1, 20);

    }
    //---------------------------------------------------------------------------------------------
    public String obtenerNombre() {//GETTER

        return nombre;
    }
    public double obtenerSueldo() {//GETTER

        return sueldo;
    }
    public Date obtenerAltaContrato() {//GETTER

        return altaContrato;
    }
    public void subeSueldo(double porcentaje){//SETTER
        double aumento=sueldo*porcentaje/100;
        sueldo +=aumento;
    }

}//fin de la clase datosEmpleado-------------------------------------------------------------------