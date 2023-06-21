package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		final int OPCIONMAX=6;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora");
		int opcion=0;
		do {
			System.out.println("=====================");
			System.out.println("= 1. Sumar          =");
			System.out.println("= 2. Restar         =");
			System.out.println("= 3. Multiplicar    =");
			System.out.println("= 4. Dividir        =");
			System.out.println("= 5. Raíz cuadrada  =");
			System.out.println("= 6. Potencia       =");
			System.out.println("= 0. Salir          =");
			System.out.println("=====================");
			System.out.println("Opción (0-"+OPCIONMAX+"): ");
			opcion = teclado.nextInt();
			
			
			double num1=0;
			double num2=0;
			if (opcion>=1 && opcion <=OPCIONMAX)  {
				System.out.println("Introduce el primer número:");
				num1=teclado.nextDouble();
				if (opcion!=5) {
					System.out.println("Introduce el segundo número:");
					num2 =teclado.nextDouble();
				}
			}
			
			
			double res=0;
			switch(opcion) {
			case 0: 
				System.out.println("Hasta luego");
				return;
			case 1:
				res = num1+num2;
				break;
			case 2:
				res = num1-num2;
				break;
			case 3:
				res = num1*num2;
				break;
			case 4:
				res = num1/num2;
				break;
			case 5:
				res = Math.sqrt(num1);
				break;
			case 6:
				res = Math.pow(num1,num2);
				break;
			
			default: 
				System.out.println("Opción incorrecta");
				return;
			}
			System.out.printf("El resultado es %.2f",res);
		}while (opcion!=0);

	}
}
