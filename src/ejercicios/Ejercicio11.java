package ejercicios;

/**
 * 9. Algoritmo que escriba la tablas de multiplicar usando 
 * esquemas for. 
 * @author David
 *
 */
public class Ejercicio11 {
	public static void main(String[] args) {
		int tabla=1;
		do {
			int i=1;
			do{
				System.out.printf("%dx%d=%d\n",tabla,i,tabla*i);
				i++;
			}while ( i<=10) ;
			System.out.println();
			tabla++;
		}while ( tabla<=10  );
	}
}
