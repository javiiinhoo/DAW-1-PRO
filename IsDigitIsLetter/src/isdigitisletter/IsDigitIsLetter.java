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
			System.out.println("\n Se tecle� un n�mero");
		else
			System.out.println("\n No se tecle� un n�mero");

		if(Character.isLetter(caracter))
			System.out.println("\n Se tecle� un car�cter");
		else
			System.out.println("\n No tecle� un car�cter");
		if(Character.isLetterOrDigit(caracter))
			System.out.println("\n e tecle� un n�mero o un car�cter");
		else
			System.out.println("\n No tecle� un n�mero o un car�cter");
		if(!Character.isLetterOrDigit(caracter))
			System.out.println("\n Se tecle� un car�cter alfanum�rico");
		else
			System.out.println("\n No e tecle� un car�cter alfanum�rico");
		

	}
}
