package ejercicioexamen1;
import java.util.Scanner;
public class EjercicioExamen1{
	//m�todo para calcular el n�mero de veces que se repite un car�cter en un String
	static int contarLetras(String frase, char letra) {
		int cont=0;
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i)== letra ){ // como ambas son string si igualamos la posici�n
				cont ++; //contamos cada vez que se cumpla la condici�n y por el for seguimos recorriendo hasta acabar frase.
			}
		}
		if (cont != 0) {
			System.out.println("El caracter "+letra+ " se repite " + cont + " veces.");
		}else{
			System.out.println("El caracter "+letra+ "no se encuentra en esta frase");
		}

		return cont;
	}
	public static void main(String[]args) {
		Scanner e = new Scanner(System.in); //invocamos el scanner
		String frase="";//iniciamos vac�a la frase
		char letra=' ';//iniciamos vac�a la letra
		System.out.println("Ingresa el texto ");
		frase = e.nextLine(); //scanner para la frase (String)
		System.out.println("Introduce la letra a buscar ");
		letra = e.next().charAt(0); //scanner para el letra (char)
		contarLetras(frase,letra);
		e.close();
	}
}
