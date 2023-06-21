package ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 6. Algoritmo que calcule el factorial de un número 
 *    entero introducido por el usuario.
 * @author David
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Factorial de un número");
		System.out.println("Introduce el número:");
		int num= teclado.nextInt();
		
		double factorial=1;
		for(int i=num; i>1; i--) {
			factorial=factorial*i;
		}
		
		DecimalFormat formateador= new DecimalFormat("#,###.00");
		System.out.println("El factorial es "+
				formateador.format(factorial));
	}

}
