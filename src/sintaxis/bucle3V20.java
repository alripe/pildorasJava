import javax.swing.JOptionPane;

public class bucle3V20 
{

	public static void main(String[] args) 
	{
		
		String genero = "";
		int pesoIdeal = 0;
		
		do 
		{
			 genero = (JOptionPane.showInputDialog("Ingrese su genero H/M"));
			
		} while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M"));
		
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura"));
		
		
		if (genero.equalsIgnoreCase("H"))
		{
			pesoIdeal = altura-110; 
		}
		else if (genero.equalsIgnoreCase("M")) 
		{
			pesoIdeal = altura-120;
		}	
		System.out.print("Tu peso ideal es " + pesoIdeal + " Kg");
	}
}
