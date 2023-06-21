package ejercicios;

import java.util.Scanner;

/**
 * 4. Algoritmo que escriba los números impares comprendidos 
 * entre dos enteros introducidos por el usuario. 
 * @author David
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Impares comprendidos entre dos números");
		
		System.out.println("Introduce el primero: ");
		int inicio = teclado.nextInt();
		System.out.println("Introduce el segundo: ");
		int fin = teclado.nextInt();
		
		int aux= inicio;
		inicio=fin;
		fin=aux;
		
		
		if (inicio%2==0) inicio++;
		for (int i=inicio; i<fin; i=i+2 ) {
				System.out.println(i);
		}
		

	}

}
