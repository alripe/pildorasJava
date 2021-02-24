package herencia;

public class Persona {


    public Persona(String nombre, int edad, String curp, String nacionalidad){
        this.nombre=nombre;
        this.edad=edad;
        this.curp=curp;
        this.nacionalidad=nacionalidad;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getCurp(){
        return curp;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }

    

    private String nombre;
    private int edad;
    private String curp;
    private String nacionalidad;
}
