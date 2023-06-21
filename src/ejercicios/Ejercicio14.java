package ejercicios;

import java.util.Scanner;

/**
 * 14. Algoritmo que pida dos números naturales e imprimir 
 * su cociente entero por el método de las restas sucesivas. 
 * @author David
 *
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		System.out.println("Calculo de la división por restas sucesivas");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce dividendo:");
		int dividendo= teclado.nextInt();
		System.out.println("Introduce divisor:");
		int divisor= teclado.nextInt();
		int cociente=0;
		
		int resto=dividendo;
		while (resto>=divisor) {
			resto = resto -divisor;
			cociente++;
		}
		
//		int resto=0;
//		for (resto=dividendo;resto>=divisor;resto=resto-divisor, cociente++);
		
		System.out.printf("%d/%d da %d de cociente y %d de resto",
				dividendo, divisor,cociente,resto);
	}
}
