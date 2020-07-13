package poo;

public class datosAlumno extends datosPersona {

    private String carrera;

    public datosAlumno(String nombre, String carrera){
        super(nombre);
        this.carrera=carrera;
    }

    @Override
    public String dameDescripcion() {
        return "La carrera del alumno es: " + carrera;
    }

}
