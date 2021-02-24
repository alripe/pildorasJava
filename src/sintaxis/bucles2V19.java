package sintaxis;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class bucles2V19 
{
	public static void main(String[] args) {
		int aleatorio = (int) (Math.random() * 100);
		System.out.println(aleatorio);
		int intento = 0;
		int numero = 0;
		final int vidas = 5;

			do {
				intento++;
				numero = Integer.parseInt(JOptionPane.showInputDialog("Igresa el numero: "));

				if(aleatorio<numero) {
					JOptionPane.showMessageDialog(null, "El numero es Bajo");
				} else if(aleatorio>numero) {
					JOptionPane.showMessageDialog(null, "El numero es mas alto");
				} else {
					JOptionPane.showMessageDialog(null,"perdistes");
				}

			} while (aleatorio != numero && intento<vidas);

			if(intento<vidas) {
				JOptionPane.showMessageDialog(null, "correcto, lo superaste en " + intento);
			}
	}
}


