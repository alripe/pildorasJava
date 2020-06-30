import java.util.*;
import javax.swing.*;
public class condicionales2V17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seleccione un numero \n 1: cuadro \n 2: rectangulo \n 3: triangulo \n 4: circulo");
		System.out.print(" ");
		int figura = sc.nextInt();
		
		switch(figura) {
		
		case 1:
			
			int ladoCuadro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado"));
			System.out.println(" El resultado es " + Math.pow(ladoCuadro, 2));
		
		break;
		
		case 2:
			
			int baseRectangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
			int alturaRectangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
			System.out.println(" El resultado es " + baseRectangulo*alturaRectangulo);
			
		break;
		
		case 3:
			
			int baseTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
			int alturaTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
			System.out.println(" El resultado es " + baseTriangulo*alturaTriangulo/2);
			
		break;
		
		case 4:
			
			int radioCirculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio"));
			System.out.print(" El resultado es ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radioCirculo, 2)));
			
		break;
			
		}
		
	}

}
