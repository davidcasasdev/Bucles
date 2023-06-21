package ejercicios;

import java.util.Scanner;

/**
 * 5. Algoritmo que sume los n primeros números enteros, siendo 
 * n un número introducido por el usuario. 
 * @author David
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Suma de los n primeros numeros naturales");
		System.out.println("Introduce el número:");
		int num= teclado.nextInt();
		
		int suma=0;
		int i=1;
		while ( i<=num) {
			suma=suma+i; 
			i++;
		}
		
		System.out.printf("La suma es %d",suma);
	}

}
