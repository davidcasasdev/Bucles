package ejercicios;

import java.util.Scanner;

/**
 * 7. Algoritmo que cuente cuántos múltiplos de 7 hay entre dos
 *  enteros dados por el usuario. 
 * @author David
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println("Cuenta de multiplos de 7 entre 2 numeros");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		int inicio = teclado.nextInt();
		System.out.println("Introduce el segundo número:");
		int fin = teclado.nextInt();
		
		int contador=0;
//		while (inicio%7!=0) {
//			inicio++;
//		}
		if (inicio%7!=0) inicio=inicio+7-(inicio%7);
		
		for (int i=inicio; i<=fin; i=i+7) {
				contador++;
		}
		System.out.printf("Hay %d divisores de 7 entre %d y %d", 
				contador,inicio,fin);
		
	}

}
