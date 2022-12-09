package palindromo;
import java.util.Scanner;
public class Palindromo{

	public static void main(String []args) {
		Scanner e= new Scanner(System.in);
		String frase,limpia=null;
		int i;
		boolean palabra=true;
		System.out.println("Introduzca una frase");
		frase=e.nextLine();
		e.close();
		if(frase!=" "){
			limpia=frase.toLowerCase();
			for(i=0;i<(limpia.length()-1)/2;i++) {
				if(frase.charAt(i)!=limpia.charAt(i)){
						palabra=false;
						i=limpia.length();
				}
			}
		}
	
		if (palabra=true) 
			System.out.println("Palíndromo");
		else
			System.out.println("No es palíndromo");

	}
}