package contarpalabras;
import java.util.Scanner;
public class ContarPalabras{
static int Palabras(String s){    
	int c = 0,i=0;    
	boolean palabra = false;
	int fin = s.length()-1;
	for (i = 0; i < s.length(); i++) {
		if (Character.isLetter(s.charAt(i)) && i != fin) {
			palabra = true;
		} else if (!Character.isLetter(s.charAt(i)) && palabra) {
			c++;
			palabra = false;
		} else if (Character.isLetter(s.charAt(i)) && i == fin) {
			c++;
		}
	}
	return c;
}
	public static void main (String[]args) {
		Scanner e=new Scanner(System.in);
		String s;
		System.out.println("Teclee una frase. ");
		s=e.nextLine();
		System.out.println("Número de palabras: "+Palabras(s));		
		e.close();

	}
	}
