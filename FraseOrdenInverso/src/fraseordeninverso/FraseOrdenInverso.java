package fraseordeninverso;
import java.util.Scanner;
public class FraseOrdenInverso{
	public static void main(String  []args) {
		Scanner e= new Scanner(System.in);
		String frase ="";
		System.out.print("Teclea valor frase?");
		frase=e.nextLine();
		for(int i= frase.length()-1;i>=0;i--)
			System.out.print(frase.charAt(i));
		e.close();
	}
	
}