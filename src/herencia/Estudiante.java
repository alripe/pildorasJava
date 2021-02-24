package herencia;

public class Estudiante extends Persona {


    public Estudiante(String nombre, int edad, String curp, String nacionalidad, String matricula){
        super(nombre,edad,curp,nacionalidad);
        this.matricula= matricula;
    }

    public String getMatricula(){
        return matricula;
    }
    private String matricula;

}
