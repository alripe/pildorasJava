
public class claseStringV12 {

	public static void main(String[] args) {
		
		//manipulacion de cadenas subString
		
		String frase="Hoy es un estupendo dia para aprender a programar";
		String lineaFrase=frase.substring(0, 29);
		System.out.println("El resumen de la frase es -- " + lineaFrase);
		
		String nombre1 = "Alex";
		String nombre2 = "Alex";
		
		//manipulacion de cadenas equals
		
		boolean comparacion = (nombre1.equals(nombre2));
		System.out.println(comparacion);
		
		System.out.println(nombre1.equals(nombre2));
	}
}
