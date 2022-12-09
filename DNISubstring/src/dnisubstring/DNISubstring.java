package dnisubstring;
import java.util.Scanner;
public class DNISubstring{
	static char letrasDNI (int num) {
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		return letras.charAt(num%23);
	}
	static char separarDNI (String DNI,String numero,String letra) {
		numero=DNI.substring(0,8);
		letra=DNI.substring(8,9);
		System.out.println("Números del DNI:"+numero);
		System.out.println("Letra del DNI:"+letra);
		return letra.charAt(8);
	}	
	public static void main(String []args){
		Scanner e=new Scanner(System.in);
		String DNI="";
		String numero="";
		String letra="";
		boolean valido=true;
		do {
			System.out.print("Teclee su DNI completo: ");
			DNI=e.next();
			if (DNI.length()!=9)
				valido=false;
			if (!valido)
				System.out.println("DNI incorrecto!!");					
		}while(DNI.length()!=9);
				
		e.close();
	}
}