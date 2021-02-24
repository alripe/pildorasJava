package empleado;

public class DatosEmpleado {


    public DatosEmpleado(String nombre, String segNombre, String apellidoP, String apellidoM, int edad, double sueldoTotal) {

        this.nombre = nombre;
        this.segNombre = segNombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
        this.sueldoTotal = sueldoTotal;
    }


    public DatosEmpleado(String nombre, String apellidoP, String apellidoM, int edad, double sueldoTotal) {
        this(nombre, "NA", apellidoP, apellidoM, edad, sueldoTotal);
    }

    public DatosEmpleado(String nombre, String apellidoP, String apellidoM, int edad) {
        this(nombre, "NA", apellidoP, apellidoM, edad, 4000);
    }

    public DatosEmpleado(String nombre, String segNombre, String apellidoP, String apellidoM, int edad) {
        this(nombre, segNombre, apellidoP, apellidoM, edad, 4000);


    }

    public String mostrarDatos(){
        return nombre+" "+segNombre+" "+apellidoP+" "+apellidoM+" "+edad+" "+sueldoTotal;
    }


        private String nombre;
        private String segNombre;
        private String apellidoP;
        private String apellidoM;
        private int edad;
        private double sueldoTotal;
}

