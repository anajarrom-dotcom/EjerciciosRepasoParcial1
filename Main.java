package repasoParcial;

import java.util.Scanner;

public class Main {
	static Scanner Sc = new Scanner(System.in);
	
	public static void main (String []args) {
		sumaDivisibles4();
		numeroFactorial();
	}
		// Ejercicio1
		 static void sumaDivisibles4() {
			System.out.println("Ingrese un numero:");
			 int numero = Sc.nextInt();
			 int suma = 0;
			 
			 for (int i = 1; i<= numero; i++) {
				 if ( i % 4 == 0) {
					 suma +=i;
				 }
			 }
			 System.out.println("La suma es:" + suma);
		}
		static void numeroFactorial() {
			
			long factorial = 1;
			System.out.println("Ingrese el numero:");
			int n = Sc.nextInt();
			
			for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
			System.out.println("El factorial del numero es:" + factorial);
}
}
