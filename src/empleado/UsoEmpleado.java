package empleado;

public class UsoEmpleado {

public static void main (String [] args ){

    DatosEmpleado[] listaEMP = new DatosEmpleado[2];
    DatosEmpleado[] listaBEC = new DatosEmpleado[2];

    //String [] nombres = new String[4];

    listaEMP [0] = new DatosEmpleado("Jose","Alejandro","Rivera","Perez",25,8000);
    listaEMP [1] = new DatosEmpleado("Hector","Rosiles","Meza",30,8000);

    listaBEC [0] = new DatosEmpleado("Juan","Lopez","Hernandez",21);
    listaBEC [1] = new DatosEmpleado("Luisa","Amelia","Perez","Castro",24);


    for (DatosEmpleado i:listaEMP){
        System.out.println(i.mostrarDatos());
    }

    System.out.println();

    for (DatosEmpleado e:listaBEC){
        System.out.println(e.mostrarDatos());
    }



    /*System.out.println(EMP1.mostrarDatos());
    System.out.println(EMP2.mostrarDatos());

    System.out.println(BEC1.mostrarDatos());
    System.out.println(BEC2.mostrarDatos());*/




    }
}

