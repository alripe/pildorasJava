package herencia;

public class EstudiantePrimaria extends Estudiante {
    EstudiantePrimaria(String nombre, int edad, String curp, String nacionalidad, String matricula, String nombrePrimaria, double calificacionFinalPrimaria){
        super(nombre, edad,curp, nacionalidad,matricula);
        this.calificacionFinalPrimaria=calificacionFinalPrimaria;
        this.nombrePrimaria=nombrePrimaria;
    }

    public EstudiantePrimaria(String nombre, int edad, String curp, String nacionalidad, String matricula){
        super(nombre, edad, curp, nacionalidad, matricula);
    }

    double calificacionFinalPrimaria;
    String nombrePrimaria;
}
