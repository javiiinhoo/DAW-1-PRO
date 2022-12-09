package arraystring;
import java.util.Scanner;
public class ArrayString{
	public static void main (String[]args) {
		String cadena= "", cadena1="";
		char vcadena[];
		char vcadena1[];
		int i,longitud=0;
		Scanner e= new Scanner (System.in);
		System.out.println("Teclea cadena?");
		cadena=e.nextLine();
		longitud=cadena.length();
		vcadena= new char[longitud];
		for(i=0;i<longitud;i++) {
			vcadena[i]=cadena.charAt(i);
		}
		for(i=0;i<longitud;i++) 
			System.out.println(vcadena[i]);
		vcadena1=cadena.toCharArray();
		System.out.println("\n\n Visualización de vcadena1:");
		for(i=0;i<longitud;i++) 
			System.out.println(vcadena1[i]);
		//cadena1=String.valueof(vcadena)
		//System.out.println("Cadena1 = "+cadena1);
	}
}