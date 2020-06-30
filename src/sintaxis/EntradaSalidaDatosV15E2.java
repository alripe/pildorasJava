import javax.swing.JOptionPane;

public class EntradaSalidaDatosV15E2 {

	public static void main(String[] args) {
		
		String raiz = JOptionPane.showInputDialog("Ingrese un numero");
		
		double raizDouble = Double.parseDouble(raiz);
		
		System.out.printf("%1.2f", Math.sqrt(raizDouble));
		
	}

}
