package sintaxis;

import javax.swing.JOptionPane;

public class Peso {
    public static void main(String[]args){
        //hombre = altura-110
        //mujeres = alturas-120

        int altura;
        int Peso;
        String genero = null;

        do {
            genero = JOptionPane.showInputDialog(" Ingresas tu genero\n H-Hombre \n M-Mujer");
        }while(genero.equalsIgnoreCase("H")==false&&genero.equalsIgnoreCase("M")==false);
    }
}
