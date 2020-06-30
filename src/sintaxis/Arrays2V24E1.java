
public class Arrays2V24E1 
{

	public static void main(String[] args) 
	{
		
		String [] paises = new String [8];
		
		paises [0] = "Mexico";
		paises [1] = "Francia";
		paises [2] = "Italia";
		paises [3] = "Alemania";
		paises [4] = "Rusia";
		paises [5] = "China";
		paises [6] = "Argentima";
		paises [7] = "Chile";


		for (int i = 0; i < paises.length; i++) {
			
			System.out.println("El pais " + (i+1) + " es " + paises[i]);
			
		}
		
	}

}
