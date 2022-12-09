package comprobardni;
import java.util.Scanner;
public class ComprobarDNI{
	static char letrasDNI (int num) {
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		return letras.charAt(num%23);
	}
	static boolean comprobarLetra(int n, char l) {
		boolean correcto = false;
		if(letrasDNI(n)==Character.toUpperCase(l))
			correcto=true;
		return correcto;
	}
	public static void main(String []args){
		Scanner e=new Scanner(System.in);
		String DNI=null;
		int numero=0;
		char letra=' ';
		boolean error=true;
		do {
			do {
				error=false;
				do {
					System.out.print("Teclee su DNI: ");
					DNI=e.next();

					try {
						numero=Integer.parseInt(DNI.substring(0,8));
					}catch(NumberFormatException nfe) {
						System.out.println("Caracteres no numéricos");
						error=true;
					}
					try {
						if(!Character.isLetter(letra)) {
							System.out.println("No se ha introducido una letra en la 9ª posición.");
							error=true;
						}
						}catch(NumberFormatException nfe) {
							
						}
					}while(DNI.length()!=9);
				}while(error);
				letra=DNI.charAt(8);
				if(!comprobarLetra(numero,letra))
					System.out.println("DNI incorrecto.");
			}while(!comprobarLetra(numero,letra));
			System.out.println("DNI correcto.");
			System.out.println("\n Final del programa.\n");
			e.close();
		}
	}
