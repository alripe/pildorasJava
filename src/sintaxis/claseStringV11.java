
public class claseStringV11 {
	
	public static void main(String[] args) {
		
		String nombre="Alex";
		
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		System.out.println("La primera letra de tu nombre es " + nombre.charAt(0));
		
		int ultimaLetra=nombre.length();
		
		System.out.println("La ultima letra de mi nombre es " + nombre.charAt(ultimaLetra-1));
		
		
	}

}
