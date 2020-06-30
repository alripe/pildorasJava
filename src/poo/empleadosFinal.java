package poo;

public class empleadosFinal {

    public static void main (String[] args){

        Empleados [] datosEmpleados = new Empleados[5];

        datosEmpleados[0] = new Empleados("alejandro");
        datosEmpleados[1] = new Empleados("Jose");
        datosEmpleados[2] = new Empleados("Alfredo");
        datosEmpleados[3] = new Empleados("Martin");
        datosEmpleados[4] = new Empleados("Dominique");

        datosEmpleados[1].cambiarSeccion("RRHH");

        for (int i=0;i<datosEmpleados.length;i++ ) {
            System.out.println(datosEmpleados[i].obtenerDatosEmpleado());
            //System.out.println();
        }

    }
}


 class Empleados{

    private final String nombre;
    private String seccion;
    public int id;
    private static int IdSiguiente=1;

    public Empleados(String nom){
        nombre=nom;
        seccion="Administracion";
        id=IdSiguiente;
        IdSiguiente++;
    }


    public String obtenerDatosEmpleado(){
        return " El nombre del empleado es: " +nombre+ "con id " +id+  " en la seccion " +seccion;
    }

    public void cambiarSeccion(String seccion){
        this.seccion=seccion;
    }
}

