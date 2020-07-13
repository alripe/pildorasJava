package poo;

abstract class datosPersona {

    //variables
    private String nombre;

    //constructor
    public  datosPersona(String nombre){
        this.nombre=nombre;

    }

    //metodo getter
    public String dameNombre(){
        return nombre;

    }

    public abstract String dameDescripcion();

}


