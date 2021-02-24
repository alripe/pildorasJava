package sintaxis;

public class Each {
    public static void main(String []args){

        int numeros [] = {1,3,4,5,7,6,5,4,7,30};

        for (int conNumeros:numeros){ //forEach

            System.out.println("el numero en la posicion " +(conNumeros+1)+ " es: "+conNumeros);
        }
    }
}


//for tradicional int i=0;i<numeros.length;i++

// forEach int conNumeros:numeros