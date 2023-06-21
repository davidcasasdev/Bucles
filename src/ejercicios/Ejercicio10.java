package ejercicios;

/**
 * 9. Algoritmo que escriba la tablas de multiplicar usando 
 * esquemas for. 
 * @author David
 *
 */
public class Ejercicio10 {
	public static void main(String[] args) {
		int tabla=1;
		while ( tabla<=10  ) {
			int i=1;
			while ( i<=10) {
				System.out.printf("%dx%d=%d\n",tabla,i,tabla*i);
				i++;
			}
			System.out.println();
			tabla++;
		}
	}
}
