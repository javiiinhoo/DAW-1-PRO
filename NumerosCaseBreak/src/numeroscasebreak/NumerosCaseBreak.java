package numeroscasebreak;
import java.util.Scanner;
public class NumerosCaseBreak{
	public static void main(String[]args){
		Scanner e= new Scanner(System.in);
		int numero=0;
		System.out.print("Teclee número=");
		numero= e.nextInt();
		switch (numero) {
		case 1:
			System.out.println("Se tecleó el 1");
			break;
		case 2:
			System.out.println("Se tecleó el 2");
			break;
		case 3:
			System.out.println("Se tecleó el 3");
			break;
		default:
			System.out.println("Se tecleó un número distinto a 1,2 o 3");
			e.close();
		}
	}
}