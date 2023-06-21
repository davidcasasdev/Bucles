package ejercicios;

import java.util.Scanner;

/**
 * 8. Algoritmo que escriba todos los divisores de un número 
 * entero introducido por el usuario. 
 * @author David
 *
 */
public abstract class Ejercicio8_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("CAlculo de los divisores de un número");
		System.out.println("Introduce el número a calcular:");
		int num = teclado.nextInt();
		String divisores1 ="", divisores2="";
		
		
		for (int i=1; i<num/i; i++) {
			if (num%i==0) {
				divisores1 = divisores1 +" "+ i;
				divisores2 = num/i + " " + divisores2;
			}
		}
		System.out.printf("los divisores son %s",
				divisores1+ " "+divisores2);
	}

}
