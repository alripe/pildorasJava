package herencia;

public class EstudianteUniversidad extends EstudiantePrepa {

    public EstudianteUniversidad(String nombre, int edad, String curp, String nacionalidad, String matricula, String nombreUniversidad, double calificacionFinalUniversidad){
        super(nombre, edad, curp, nacionalidad, matricula);
        this.nombreUniversidad=nombreUniversidad;
        this.calificacionFinalUniversidad=calificacionFinalUniversidad;
    }

    public EstudianteUniversidad(String nombre, int edad, String curp, String nacionalidad, String matricula){
        super(nombre, edad, curp, nacionalidad, matricula);
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }
    public double getCalificacionFinalUniversidad() {
        return calificacionFinalUniversidad;
    }

    private String nombreUniversidad;
    private double calificacionFinalUniversidad;
}
