package isdigitisletter;
import java.io.IOException;
public class IsDigitIsLetter{
	public static void main(String[]args){
		char caracter= ' ';
		try {
			System.out.print("Teclea caracter?");
			caracter=(char) System.in.read();
		}catch(IOException ioe) {} ;
		if(Character.isDigit(caracter))
			System.out.println("\n Se tecleó un número");
		else
			System.out.println("\n No se tecleó un número");

		if(Character.isLetter(caracter))
			System.out.println("\n Se tecleó un carácter");
		else
			System.out.println("\n No tecleó un carácter");
		if(Character.isLetterOrDigit(caracter))
			System.out.println("\n e tecleó un número o un carácter");
		else
			System.out.println("\n No tecleó un número o un carácter");
		if(!Character.isLetterOrDigit(caracter))
			System.out.println("\n Se tecleó un carácter alfanumérico");
		else
			System.out.println("\n No e tecleó un carácter alfanumérico");
		

	}
}
