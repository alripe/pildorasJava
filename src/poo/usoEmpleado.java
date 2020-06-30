
package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class usoEmpleado {

    public static void main (String arg[]){

        /*datosEmpleado empleado1 = new datosEmpleado
                ("Alejandro",10000, 2018, 8, 27);
        datosEmpleado empleado2 = new datosEmpleado
                ("Jose" , 20000, 2015, 9, 20);
        datosEmpleado empleado3 = new datosEmpleado
                ("Roberto" , 16000, 2000, 6, 13);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println("El nombre del empleado es: "+empleado1.obtenerNombre()+
                            "\nSu sueldo es: "+empleado1.obtenerSueldo()+
                            "\nLa fecha de alta del contrato es: "+empleado1.obtenerAltaContrato());
        System.out.println();

        System.out.println("El nombre del empleado es: "+empleado2.obtenerNombre()+
                "\nSu sueldo es: "+empleado2.obtenerSueldo()+
                "\nLa fecha de alta del contrato es: "+empleado2.obtenerAltaContrato());
        System.out.println();

        System.out.println("El nombre del empleado es: "+empleado3.obtenerNombre()+
                "\nSu sueldo es: "+empleado3.obtenerSueldo()+
                "\nLa fecha de alta del contrato es: "+empleado3.obtenerAltaContrato());*/

        /*datosEmpleado[] misEmpleados = new datosEmpleado[4];

        misEmpleados[0] = new datosEmpleado ("Alejandro", 10000, 2018, 8, 27 );
        misEmpleados[1] = new datosEmpleado("Jose", 20000, 2015, 9, 20);
        misEmpleados[2] = new datosEmpleado("Roberto", 16000, 2000, 6, 13);
        misEmpleados[3] = new datosEmpleado("Dominique");

        for(int i = 0; i<misEmpleados.length;i++){
            misEmpleados[i].subeSueldo(5);
        }

        for (int i = 0; i<misEmpleados.length;i++){
            System.out.println("El nombre del empleado es: "+misEmpleados[i].obtenerNombre()+
                    "\nSu sueldo es: "+misEmpleados[i].obtenerSueldo()+
                    "\nLa fecha de alta del contrato es: "+misEmpleados[i].obtenerAltaContrato());
            System.out.println();
        }*/

        datosJefe jefe1 = new datosJefe("alejandro", 10000,2000,9,27);

        jefe1.ingreseBono(10000);

        System.out.println("El nombre del empleado es: "+jefe1.obtenerNombre()+
                "\nSu sueldo es: "+jefe1.obtenerSueldo()+
                "\nLa fecha de alta del contrato es: "+jefe1.obtenerAltaContrato());
        System.out.println("El  bono es de " + jefe1.mostrarBono());


    } //fin del metodo main
} //fin de la clase Empleados



