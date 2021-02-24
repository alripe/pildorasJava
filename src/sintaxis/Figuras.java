package sintaxis;

import javax.swing.JOptionPane;

public class Figuras {
    public static void main(String [] args){

        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresas la figura: " +
                        "\n1--cuadrado " +
                        "\n2--rectangulo"+
                        "\n3--triangulo"+
                        "\n4--circulo"
        ));

        //System.out.println(dato+1);

        switch (dato){
            case 1:
                int ladoCuadrado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadraso"));
                JOptionPane.showMessageDialog(null,"El resultado es " + Math.pow(ladoCuadrado,2));
                break;

            case 2:
                int baseRectangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base del rectangulo"));
                int alturaRectangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrea la altura del rectangulo"));
                JOptionPane.showMessageDialog(null,"El resultado es: "+ baseRectangulo*alturaRectangulo);
                break;


        }

    }
}
