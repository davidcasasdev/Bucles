package ejercicios;

import java.util.Scanner;

/**
 * 12. Algoritmo que determine si un número entero dado es 
 * perfecto o no. Se dice que un número es perfecto cuando 
 * es igual a la suma de sus divisores, excluido él mismo. 
 * Por ejemplo 6 es perfecto, ya que 6 = 1 + 2 + 3.
 * @author David
 *
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo número perfecto");
		
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		
		int suma=1;
		for (int i=2;i<num; i++ ) {
			if (num%i==0 ) {
				suma=suma+i;
			}
		}
		if (suma==num) 
			System.out.println("El numero "+num+"es perfecto");
		else
			System.out.printf("El numero %d NO es perfecto", num);
	}
}
