package herencia;

public class EstudianteSecundaria extends EstudiantePrimaria {


    public EstudianteSecundaria(String nombre, int edad, String curp, String nacionalidad, String matricula, String nombrePrimaria, double calificacionFinalPrimaria, String nombreSecundaria, double calificacionFinalSecundaria) {
        super(nombre, edad, curp, nacionalidad, matricula, nombrePrimaria, calificacionFinalPrimaria);
        this.calificacionFinalSecundaria=calificacionFinalSecundaria;
        this.nombreSecundaria=nombreSecundaria;
    }
    public EstudianteSecundaria(String nombre, int edad, String curp, String nacionalidad, String matricula){
        super(nombre, edad, curp, nacionalidad, matricula);
    }

    public String getNombreSecundaria() {
        return nombreSecundaria;
    }
    public double getCalificacionFinalSecundaria() {
        return calificacionFinalSecundaria;
    }

    private String nombreSecundaria;
    private double calificacionFinalSecundaria;
}
