package palindromo;
import java.util.Scanner;
public class PalindromoMetodo{
	static boolean comprobarPal(String frase) {
		boolean palabra=true;
		String limpia=null;
		int i;
		if(frase!=" "){				
			limpia=frase.toLowerCase();
			for(i=0;i<(limpia.length()-1)/2;i++) {
				if(frase.charAt(i)!=limpia.charAt(i)){
					palabra=false;
					i=limpia.length();
					if (palabra=true) 
						System.out.println("Palíndromo");
					else
						System.out.println("No es palíndromo");
				}
			}
		}	
		return palabra;
	}
		public static void main(String []args) {
		Scanner e= new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase;
		frase=e.nextLine();
		comprobarPal(frase);
		e.close();
		boolean palabra;
		if (palabra=true) 
			System.out.println("Palíndromo");
		else
			System.out.println("No es palíndromo");
	}
}