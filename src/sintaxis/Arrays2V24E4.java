
public class Arrays2V24E4 {

	public static void main(String[] args) {
		
		int matrizAleatorio [] = new int [150];
		
		for (int i = 0; i < matrizAleatorio.length; i++) {
			
			matrizAleatorio[i] = (int)(Math.random()*100);
			 			
		}
		
		for (int numeros:matrizAleatorio) {
			
			System.out.println(numeros);
			
		}

	}

}
