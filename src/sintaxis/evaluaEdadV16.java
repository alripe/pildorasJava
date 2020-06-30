import java.util.*;
public class evaluaEdadV16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingresa tu edad");
		int edad = sc.nextInt();
		
		if(edad>=18) {
			
			System.out.println("Eres mayor de edad");
			
		}
		
		System.out.println("Eres menor de edad");
	}

}
