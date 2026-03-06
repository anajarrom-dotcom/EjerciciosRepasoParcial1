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
		leerHora();
		convertirNumeroRomano();
		opcionMultiple();
		numeroMayorMenorDiferencia();
		tablaDivision();
		cantidadDigitosPares();
		determinarNumeroTriangular();
		promedioNegativos();
		multiplosDeSeis();
		potenciaDeDos();
		numeroInvertido();
		determinarNumeroParOImpar();
		leerTemperatura();
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
		//Ejercicio8
		static void leerHora() {
			System.out.println("Ingrese la hora");
		    int hora = Sc.nextInt();
		    
		    if(hora<12)
		    	System.out.println("Manana");
		    else if(hora<18)
		    	System.out.println("Tarde");
		    else
		    	System.out.println("Noche");
		} 
		//Ejercicio9
		static void convertirNumeroRomano() {
			
			System.out.println("Numero (1 a 5)");
			int n = Sc.nextInt();
			
			switch(n) {
			
			case 1: System.out.println("I");
			break;
			case 2: System.out.println("II");
			break;
			case 3: System.out.println("III");
			break;
			case 4: System.out.println("IV");
			break;
			case 5: System.out.println("V");
			break;
			default: 
				System.out.println("fuera de rango");
		}
}
		//Ejercicio10
		static void opcionMultiple() {
			int opcion, a, b;
			
			System.out.println("1.Sumar 2.Restar 3.Multiplicar");
			opcion = Sc.nextInt();
			
			System.out.println("Numero 1:");
			a = Sc.nextInt();
			System.out.println("Numero 2:");
			b = Sc.nextInt();
			
			switch(opcion) {
			case 1: System.out.println("Resultado:" + (a+b));
			case 2: System.out.println("Resultado" + (a-b));
			case 3: System.out.println("Resultado" + (a*b));
			}
		}
		//Ejercicio11
		static void numeroMayorMenorDiferencia() {
			int a, b;
			
			a= Sc.nextInt();
			b = Sc.nextInt();
			
			int mayor = Math.max(a, b);
			int menor = Math.min(a, b);
			
			System.out.println("Mayor:" + mayor);
			System.out.println("Menor" + menor);
			System.out.println("Diferencia" + Math.abs(a-b));
		}
		//Ejercicio12
		static void tablaDivision() {
			int n = Sc.nextInt();
			
			for(int i = 1; i <= n; i++) {
				System.out.println(n+"/"+i+"="+(n/i));
				
			}
			
		}
		//Ejercicio13
		static void cantidadDigitosPares() {
			int n = Sc.nextInt();
			int contador = 0;
			
		while(n>0) {
				int d = n % 10;
				
				if (d % 2 == 0)
					contador ++;
				n/=10;
			}
		}
		//Ejercicio14
		static void determinarNumeroTriangular() {
			
			int n = Sc.nextInt();
			int suma = 0;
			int k = 1;
			
			while(suma<n) {
				suma += k;
				k++;
			}
			if(suma == n)
				System.out.println("Es triangular");
			else
				System.out.println("No estriangular");
		}
		//Ejercicio15
		static void promedioNegativos() {
			
			int n = 0;
			int num;
			int suma = 0;
			int cont = 0;
			
			for(int i =1; i<=n;i++) {
				num = Sc.nextInt();
				
				if(num<0) {
					suma+=num;
					cont++;
				}
			}
			if(cont>0)
				System.out.println("Promedio:" + (suma/cont));
			else
				System.out.println("No hay negativos");
		}

//Ejercicio16
static void multiplosDeSeis() {
	int n = Sc.nextInt();
	
	for(int i = 1; i <= n; i++) {
		System.out.println(i*6);
	}
	
}
//Ejercicio17
static void potenciaDeDos() {
	int n = Sc.nextInt();
	
	while(n>1) {
		if(n%2 !=0) {
			System.out.println("Es potencia de 2");
		}
	}
}
//Ejercicio18
static void numeroInvertido() {
	int n = Sc.nextInt();
	int invertido = 0;
	
	while(n>0) {
		invertido = invertido*10+(n*10);
		n /= 10;
		
	}
	System.out.println("Invertido");
}
//Ejercicio19
static void determinarNumeroParOImpar() {
	int n = Sc.nextInt();
	int suma = (n*(n+1))/2;
	
	if(suma%2 == 0)
		System.out.println("Par");
	else 
		System.out.println("Impar");
	
}
//Ejercicio20
static void leerTemperatura() {
	
	System.out.println("Ingrese la temperatura en celsius");
	
	double c = Sc.nextInt();
	double f = (c * 9/5) + 32;
	System.out.println("Temperatura en fahrenheit:" + f);
	
}
}
