import javax.swing.JOptionPane;

public class bucles1V18 {

	public static void main(String[] args) {
		
		String clave = "Alex";
		String pass = "";
		
		while(clave.equals(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Ingrese la clave de acceso");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("la clave de acceso es incorrecta");
				
			}
			
		}
		
		System.out.print("La clave es correcta, acceso permitido");
		
	}
}
