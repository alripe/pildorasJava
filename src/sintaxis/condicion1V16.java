import java.util.Scanner;

public class condicion1V16 {
	
	public static void main (String[] argn) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingresa tu edad");
		int edad = sc.nextInt();
		
		if(edad<=17) {
			System.out.println("Eres menor de edad");
			
		}else if(edad<=18){
			System.out.println("Eres mayor de edad");
			
		}else if(edad<=40) {
			System.out.println("Eres un adulto");
			
		}else if(edad<=65) {
			System.out.println("Eres un adulto mayor");
			
		}else {
			System.out.println("cuidate");
		}
	}
}
