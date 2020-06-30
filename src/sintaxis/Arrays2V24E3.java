import javax.swing.JOptionPane;

public class Arrays2V24E3 {

	public static void main(String[] args) {

		String paises [] = new String [8];
		
		for (int i = 0; i < paises.length; i++) {
			
			 paises [i] = JOptionPane.showInputDialog("Ingrese el pais");
			
		}
		
		for (String muestraPais: paises) {
			
			System.out.println("El pais es " + muestraPais);
		
		}
	}
}
