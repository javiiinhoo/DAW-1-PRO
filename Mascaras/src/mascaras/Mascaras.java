package mascaras;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Mascaras{
	public static void main (String []args) {
		Scanner e= new Scanner(System.in);
		DecimalFormat num= new DecimalFormat("#,###.##"); //aparecer� un punto donde la coma y viceversa. (la almohadilla son espacios en blanco y el cero rellena ceros.)
	//	DecimalFormat num= new DecimalFormat("000.00"); // si ponemos ceros rellenar� los espacios con ceros., si tiene un tama�o m�nimo lo respeta.
		double n=0;
		System.out.println("Teclea n�mero�?");
		n=e.nextDouble();
		System.out.println("N�mero sin m�scara => "+n);
		System.out.println("N�mero con m�scara => "+num.format(n));
		e.close();
		}
}