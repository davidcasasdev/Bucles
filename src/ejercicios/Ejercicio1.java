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
public class Ejercicio1 {

	public static void main(String[] args) {
		int tabla;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Tabla de multiplicar ");
		
		System.out.println("¿De qué número quieres la tabla (1-10)");
		
		tabla = teclado.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d\n", tabla, i, tabla*i);
		}
		teclado.close();
	}

}
