package herencia;

public class EstudiantePrepa extends EstudianteSecundaria {

   public  EstudiantePrepa(String nombre, int edad, String curp, String nacionalidad, String matricula,String nombrePrepa, double calificacionfinalPrepa){
        super(nombre, edad, curp, nacionalidad, matricula);
        this.nombrePrepa=nombrePrepa;
        this.calificacionfinalPrepa=calificacionfinalPrepa;
    }

    public  EstudiantePrepa(String nombre, int edad, String curp, String nacionalidad, String matricula){
        super(nombre, edad, curp, nacionalidad, matricula);
    }

    public String getNombrePrepa() {
        return nombrePrepa;
    }
    public double getCalificacionfinalPrepa() {
        return calificacionfinalPrepa;
    }

    private String nombrePrepa;
    private double calificacionfinalPrepa;
}
