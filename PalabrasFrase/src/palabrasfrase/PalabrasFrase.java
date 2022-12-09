package palabrasfrase;
import java.util.Scanner;
public class PalabrasFrase {
	static String introducirFrase (Scanner e) {
		String frase=null;
		System.out.println("Introduce la frase.");
		frase= e.nextLine();
		e.close();
		return frase;		
	}
	static int contarPalabras(Scanner e, String f) {
		int pos,contPal=0;
		for(pos=0;pos<f.length();pos++)
			if(f.charAt(pos)==' ') {
				contPal++;
				while(f.charAt(++pos)==' ');
			}
		return contPal;
	}	
	public static void main (String[] args) {
		Scanner e = new Scanner (System.in);
		int contador=0;
		String frase=null;
		frase=introducirFrase(e);
		contador=contarPalabras(e,frase);
		System.out.println("La frase tiene "+(contador)+" palabras.");
		e.close();
	}
}