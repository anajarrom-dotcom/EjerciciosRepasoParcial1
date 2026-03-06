package repasoParcial;

import java.util.Scanner;

public class Main {
	static Scanner Sc = new Scanner(System.in);
	
	public static void main (String []args) {
		sumaDivisibles4();
		numeroFactorial();
		numerosPositivosNegativos();
		promedioNumerosPares();
		sumaNumeros();
		multiplo_7_6();
		numeroDivisibleEntre3YNoEn2();
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
		 // SegundoEjercicio
		static void numeroFactorial() {
			
			long factorial = 1;
			System.out.println("Ingrese el numero:");
			int n = Sc.nextInt();
			
			for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
			System.out.println("El factorial del numero es:" + factorial);
}
		//TercerEjercicio
		static void numerosPositivosNegativos() {
			
			int num;
			int positivos = 0,negativos = 0,ceros = 0;
			System.out.println("Ingrese la cantidad de numeros");
			int n = Sc.nextInt();
			
			for(int i = 1; i <= n; i++) {
				num = Sc.nextInt();
				
				if(num>0)positivos++;
				else if(num<0)negativos++;
				else ceros++;
			}
			System.out.println("Numeros Positivos:" + positivos);
			System.out.println("Numeros Negativos" + negativos);
			System.out.println("Ceros:" + ceros);
		}
		//CuartoEjercicio
		static void promedioNumerosPares() {
			
			int suma = 0,contador = 0;
			System.out.println("Ingrese el numero del que desea ver los promedios pares:");
			int n = Sc.nextInt();
			
			for(int i = 1; i <= n; i++) {
				if(i % 2 == 0) {
					contador++;
				}
			}
			if(contador>0)
				System.out.println("Promedio" + (suma/contador));
		}
		//QuintoEjercicio
		static void sumaNumeros() {
			
			int suma = 0;
			System.out.println("Ingrese un numero:(Se sumaran sus digitos)");
			int n = Sc.nextInt();
			
			while(n>0) {
				suma+= n % 10;
				n/=10;
			}
			System.out.println("Suma de digitos;" + suma);
		}
		//SextoEjercicio
		static void multiplo_7_6() {
			
			System.out.println("Ingrese un numero:");
			int n = Sc.nextInt();
			
			if( n % 7 == 0 || n % 11 == 0)
				System.out.println("Es multiplo de 7 o 11.");
			else 
				System.out.println("No es multiplo de 7 y 11");
		}
		//Ejercicio7
		static void numeroDivisibleEntre3YNoEn2() {
			
			System.out.println("Ingresa una cantidad:");
			int n = Sc.nextInt();
			
			for(int i = 1; i <= n; i++) {
				if( i % 3 == 0 && i % 2!=0) {
					System.out.println(i);
				}
			}
		}
		
}
