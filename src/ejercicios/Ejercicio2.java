package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 1. Algoritmo que imprima la tabla de multiplicar 
 * correspondiente a un número  comprendido entre 
 * uno y diez, introducido por el usuario, 
 * usando un esquema for. 
 * @author David
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		int tabla;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Tabla de multiplicar ");
		
		System.out.println("¿De qué número quieres la tabla (1-10)");
		tabla = teclado.nextInt();
		while (tabla<1 || tabla >10) {
			System.out.println("La tabla debe ser entre 1 y 10. Intenetalo de nuevo");
			tabla=teclado.nextInt();
		}
		int i=1;
		while(i<=10) {
			System.out.printf("%d x %d = %d\n", tabla, i, tabla*i);
			i++;
		}
		teclado.close();
	}

}
