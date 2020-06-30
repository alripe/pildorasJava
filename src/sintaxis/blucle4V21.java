import javax.swing.JOptionPane;

public class blucle4V21 {

	public static void main(String[] args) {
		
		int arroba = 0;
		
		int  punto = 0; 
		
		String mail = JOptionPane.showInputDialog("Ingrese su correo electronico");
		
		for ( int i = 0; i<mail.length();i++) 
		{
			
			if (mail.charAt(i)=='@') 
			{
				arroba++;
			}
			
			if (mail.charAt(i)=='.') 
			{
				punto++;
			}
		}
		
		if(arroba == 1 && punto == 1) 
		{
			System.out.println("Correcto");
		}
		else 
		{
			System.out.println("Incorrecto, ingrese un correo electronico valido");
		}
		
	}

}
