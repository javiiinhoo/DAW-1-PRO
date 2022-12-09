package metodoletradni;
import java.util.Scanner;
public class MetodoLetraDNI{
	static char letrasDNI (int num) {
		char letras[]={'T','R','W','A','G','M','Y','F','P','D','X',
				'B','N','J','Z','S','Q','V','H','L','C','K','E'
		};
		return letras[num%23];
	}
public static void main(String []args){
	Scanner e=new Scanner(System.in);
	int num=0;
	System.out.print("Teclee los números de su DNI: ");
	num=e.nextInt();
	System.out.println("DNI COMPLETO: "+num+letrasDNI(num));
	e.close();
}
}
