package objetosstring;
import java.util.Scanner;
public class ObjetosString{
	public static void main(String[]args) {
		Scanner e = new Scanner(System.in);
		String cadena1 = new String("Hoy es lunes");
		String cadena2 ="HOY ES LUNES";
		//String cadena1 = "Hoy es lunes";
		//String cadena2 ="Hoy es lunes";
		System.out.println("Cadena1= " +cadena1);
		System.out.println("Cadena2= " +cadena2);
		//if(cadena1.equals(cadena2))
		if(cadena1.equalsIgnoreCase(cadena2))
			System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");

		System.out.println("Caracter = "+cadena1.charAt(0));

		System.out.print("Teclea valor cadena1?");
		cadena1=e.next();
		System.out.println("Nuevo valor de cadena1="+cadena1);
		//vacía la entrada	
		e.nextLine();
		System.out.print("Teclea valor cadena2?");
		cadena2=e.nextLine();
		System.out.println("Nuevo valor de cadena2="+cadena2);
		
		System.out.println("La suma de cadena1 más cadena2 es="+(cadena1+cadena2));
		//Los números pierden su parte más importante: el signo.

		// charAt no permite modificar caracteres, solamente permite trabajar con él.s


		System.out.println("\n El tamaño de la cadena2 es:"+ cadena2.length());
		e.close();
	}

}