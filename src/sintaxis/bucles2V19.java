package sintaxis;

import java.util.Scanner;

public class bucles2V19 
{
	public static void main(String[] args) {
		int aleatorio = (int) (Math.random() * 100);
		System.out.println(aleatorio);
		Scanner sc = new Scanner(System.in);
		int intentos = 0;
		int numero = 0;


			do {
				intentos++;
				System.out.println("Ingrese un numero");
				numero = sc.nextInt();

				if (aleatorio < numero) {
					System.out.println("mas bajo");

				} else if (aleatorio > numero) {
					System.out.println("mas alto");
				}

			} while (aleatorio != numero);
			System.out.println("correcto lo superaste en " + intentos);
	}
}


