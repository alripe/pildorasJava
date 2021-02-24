package sintaxis;

import javax.swing.*;

public class CorreoElectronico {
    public static void main (String[]args) {

        int arroba = 0;
        boolean punto = false;
        String correo;


        do {
            System.out.println("Ingresa al while");
            correo = JOptionPane.showInputDialog("Ingresa tu correo");

            for(int i = 0;i<correo.length();i++){
                if(correo.charAt(i)=='@'){
                    arroba++;
                }
                if(correo.charAt(i)=='.'){
                    punto = true;
                }

                //JOptionPane.showMessageDialog(null,"Correo incorrecto");
                }
        }while((punto==true&&arroba==1)==false);

        System.out.println("Sale del while");



        /*correo = JOptionPane.showInputDialog("Ingresa tu correo");

        for (int i = 0;i<correo.length();i++){
            if(correo.charAt(i)=='@'){
                arroba++;

            }
            if(correo.charAt(i)=='.'){
                punto = true;
            }
        }

        if(arroba==1&&punto==true){
            JOptionPane.showMessageDialog(null,"Correo correcto");
        } else {
            JOptionPane.showMessageDialog(null,"Correo incorrecto");
        }*/
    }
}
