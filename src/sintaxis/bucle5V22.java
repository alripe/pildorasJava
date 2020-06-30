import javax.swing.JOptionPane;

public class bucle5V22 {

	public static void main(String[] args) {
		
		long resultado = 1;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		for (int i = numero;i>0;i--) {
			
			resultado=resultado*i;
			
		}
		
		System.out.print("El numero factorial de " + numero + " es " + resultado);
	}

}
