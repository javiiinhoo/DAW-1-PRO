package numeroscasebreak;
import java.util.Scanner;
public class NumerosCaseBreak{
	public static void main(String[]args){
		Scanner e= new Scanner(System.in);
		int numero=0;
		System.out.print("Teclee n�mero=");
		numero= e.nextInt();
		switch (numero) {
		case 1:
			System.out.println("Se tecle� el 1");
			break;
		case 2:
			System.out.println("Se tecle� el 2");
			break;
		case 3:
			System.out.println("Se tecle� el 3");
			break;
		default:
			System.out.println("Se tecle� un n�mero distinto a 1,2 o 3");
			e.close();
		}
	}
}