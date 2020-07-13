package poo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Date;
import java.util.GregorianCalendar;

class datosEmpleado extends datosPersona {

    //private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;


    //metodo Constructor con parametros
    public datosEmpleado(String nombre, double sueldoEmp, int agnoEmp, int mesEmp, int diaEmp){
        super(nombre);

        sueldo=sueldoEmp;

        GregorianCalendar calendario = new GregorianCalendar(agnoEmp, mesEmp, diaEmp);
        altaContrato=calendario.getTime();

        ++IdSiguiente;
        Id=IdSiguiente;
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

    @Override
    public String dameDescripcion() {
        return "El sueldo del empleado es" + obtenerSueldo() + " con Id  " + Id;
    }


}//fin de la clase datosEmpleado

