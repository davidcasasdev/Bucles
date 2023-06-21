package ejercicios;

import java.util.Scanner;

/**
 * 13. Algoritmo que pida un número natural y determine 
 * si es primo o no.
 * @author David
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		System.out.println("Programa que calcula si un número es primo");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número a comprobar");
		int num = teclado.nextInt();
		
		boolean primo=true;
		for (int i=2; i<Math.sqrt(num) && primo; i++) {
			if (num%i==0) {
				primo=false;
			} 
		}
		if (primo && num!=1) System.out.println("El número es primo");
		else System.out.println("El número no es primo");
	}
}
