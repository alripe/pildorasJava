/*
*@Alejandro Rivera Perez
*@2019-07-06
*@creditos https://www.youtube.com/watch?v=KJ718O6u5QE
* ejercicio de practica de metodos
 */
package proyectoclinica;

public class doctor {

    //-----------------------------------------------------cosntructor sin parametros
    public doctor(){

    }

    //-----------------------------------------------------cosntructor con parametros
    public doctor(int rut, String nombre, String apellido, int edad, String especialidad){

     this.rut=rut;
     this.nombre=nombre;
     this.apellido=apellido;
     this.edad=edad;
     this.especialidad=especialidad;
    }

    //-----------------------------------------------------metodos getters
    public int getRut(){
        return rut;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    public String getEspecialidad(){
        return especialidad;
    }


    //-----------------------------------------------------metodos setters
    public void setRut(int rut){
        this.rut=rut;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setApellido(String apellido){
        this.apellido=nombre;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }

    //-----------------------------------------------------metodo que devuelve los datos del doctor
    public void getDatosDoctor(){
        if (this.getEspecialidad().equalsIgnoreCase("radiologo")){
            System.out.println(" Rut " + this.getRut());
            System.out.println(" Nombre " + this.getNombre() + " Apellido " + this.getApellido());
            System.out.println(" Edad " + this.getEdad());
            System.out.println(" Especialidad " + this.getEspecialidad());
        }
    }

    //-----------------------------------------------------Atributos--variables
    private int rut;
    private String nombre;
    private String apellido;
    private int edad;
    private String especialidad;
}



