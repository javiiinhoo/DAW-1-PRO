package metodoletradni;
import java.util.Scanner;
public class MetodoLetraDNIString{
	static char letrasDNI (int num) {
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		return letras.charAt(num%23);
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
