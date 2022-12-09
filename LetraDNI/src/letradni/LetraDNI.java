package letradni;
import java.util.Scanner;
public class LetraDNI{
	public static void main(String []args) {
		Scanner e=new Scanner (System.in);
		int dni=0;
		char letras[]={'T','R','W','A','G','M','Y','F','P','D','X',
				'B','N','J','Z','S','Q','V','H','L','C','K','E'};
		System.out.print("Teclee los números de su DNI: ");
		dni=e.nextInt();

		System.out.println("DNI COMPLETO: "+dni+letras[(dni % 23)]);

		e.close();
	}
}
