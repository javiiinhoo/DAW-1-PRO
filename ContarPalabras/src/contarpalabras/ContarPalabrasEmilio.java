package contarpalabras;
import java.util.Scanner;
public class ContarPalabrasEmilio{

	public static void main (String[]args) {
		Scanner e=new Scanner(System.in);
		String frase=null;
		int pos,contPal=0;
		System.out.println("Teclear frase?");
		frase=e.nextLine();
		e.close(); 
		for(pos=0;pos<frase.length();pos++)
			if(frase.charAt(pos)==' ') {
				contPal++;
				while(frase.charAt(++pos)==' ');
			}
		System.out.println("Número de palabras: "+ ++contPal);		

	}
	}
