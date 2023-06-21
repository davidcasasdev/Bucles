package ejercicios;

/**
 * 9. Algoritmo que escriba la tablas de multiplicar usando 
 * esquemas for. 
 * @author David
 *
 */
public class Ejercicio9_f {
	public static void main(String[] args) {
		
		for (int i=1; i<=10;i++) {
			for (int tabla=1; tabla<=10; tabla++ ) {
				System.out.printf("%dx%d=%d\t\t",tabla,i,tabla*i);
			}
			System.out.println();
		}
	}
}
