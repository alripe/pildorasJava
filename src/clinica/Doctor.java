package clinica;

public class Doctor {
    
    public Doctor(){
    }
    
   public Doctor(String rut,String nombre, String apellido, int edad, String especialidad, int turno){
       //this.rut=rut;
       setRut(rut);
       this.nombre=nombre;
       this.apellido=apellido;
       //this.edad=edad;
       setEdad(edad);
       this.especialidad=especialidad;
       this.turno=turno;
    }
   
   
   public String getRut(){
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
   public int getTurno(){
       return turno;
   }
   
   
   public void setRut( String rut){
       if(rut.length()==8){
          this.rut = rut; 
       } else {
           System.out.println();
           System.out.println("El rut debe de ser de 8 caracteres");
       }
   }
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   public void setApellido(String apellido){
       this.apellido = apellido;
   }
   public void setEdad(int edad){
       if(edad>=24){
           this.edad = edad;
       }else{
           System.out.println("La edad debe de ser mayor o igual a 24");
       } 
   }
   public void setEspecialidad(String especialidad){
       this.especialidad = especialidad;
   }
   public void setTurno(int turno){
       this.turno = turno;
   }
   
   
   public void mostrarDatosDoctor(){
       if(getEspecialidad().equalsIgnoreCase("radiologo")){

           System.out.println();
           System.out.println("El rut es: " + getRut());
           System.out.println("El nombre es: " + getNombre() + " " + getApellido());
           System.out.println("La edad es: " + getEdad());
           System.out.println("La especialidad es: " + getEspecialidad());
           System.out.println("El turno es de: " + getTurno());
       }else{
           System.out.println("No se pueden mostrar los datos, solo radiologos");
       }
   }
   
   
   private String rut;
   private String nombre;
   private String apellido;
   private int edad;
   private String especialidad;
   private int turno;
}
