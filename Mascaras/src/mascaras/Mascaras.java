package mascaras;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Mascaras{
	public static void main (String []args) {
		Scanner e= new Scanner(System.in);
		DecimalFormat num= new DecimalFormat("#,###.##"); //aparecerá un punto donde la coma y viceversa. (la almohadilla son espacios en blanco y el cero rellena ceros.)
	//	DecimalFormat num= new DecimalFormat("000.00"); // si ponemos ceros rellenará los espacios con ceros., si tiene un tamaño mínimo lo respeta.
		double n=0;
		System.out.println("Teclea número¿?");
		n=e.nextDouble();
		System.out.println("Número sin máscara => "+n);
		System.out.println("Número con máscara => "+num.format(n));
		e.close();
		}
}