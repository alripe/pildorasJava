import java.util.Scanner;

public class EntradaSalidaDatosV14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombreUsuario=entrada.nextLine();
		
		System.out.println("Ingrese su edad: ");
		int edadUsuario=entrada.nextInt();
		
		System.out.println("Tu nombre es: " + nombreUsuario + " y la edad es: " + edadUsuario);
	}
}
