package sintaxis;

import javax.swing.*;

public class PesoIdeal {
    public static void main (String []args){
        //formulas
        //altura-110 hombres
        //altura-120 mujeres

        String genero = null;
        int pesoIdeal;
        int altura;

        do{
            genero= JOptionPane.showInputDialog("Ingresa tu genero(H/M)");
        }while(genero.equalsIgnoreCase("H")==false&&genero.equalsIgnoreCase("M")==false);

        if (genero.equalsIgnoreCase("H")){
            altura=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura en centimetros"));
            pesoIdeal = altura - 110;
            JOptionPane.showMessageDialog(null,"Tu peso ideal es: "+ pesoIdeal);
        } else if(genero.equalsIgnoreCase("M")){
            altura=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura en centimetros"));
            pesoIdeal = altura - 120;
            JOptionPane.showMessageDialog(null,"Tu peso ideal es: "+ pesoIdeal);
        }
    }
}
