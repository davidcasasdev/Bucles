package ejercicios;

/**
 * 9. Algoritmo que escriba la tablas de multiplicar usando 
 * esquemas for. 
 * @author David
 *
 */
public class Ejercicio9 {
	public static void main(String[] args) {
		
		for (int tabla=1; tabla<=10; tabla++ ) {
			for (int i=1; i<=10;i++) {
				System.out.printf("%dx%d=%d\n",tabla,i,tabla*i);
			}
			System.out.println();
		}
	}
}
