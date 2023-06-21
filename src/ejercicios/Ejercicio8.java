package ejercicios;

import java.util.Scanner;

/**
 * 8. Algoritmo que escriba todos los divisores de un número 
 * entero introducido por el usuario. 
 * @author David
 *
 */
public abstract class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("CAlculo de los divisores de un número");
		System.out.println("Introduce el número a calcular:");
		int num = teclado.nextInt();
		
		
		
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				System.out.println(i);
			}
		}
	}

}
