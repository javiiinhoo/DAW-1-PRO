package metodosuma;
import java.util.Scanner;
public class MetodoSuma{
	//static void suma(int n1,int n2){ //no devuelve nada por lo tanto es void.
	//	System.out.println(n1+n2);
	//}
	static int suma(int n1,int n2) {
		int suma=0;
		suma=n1+n2;
		return suma;
	}
	//static int suma3(int n1,int n2){
	// return n1+n2;
	//}
	public static void main (String[]args){
		Scanner e= new Scanner(System.in);
		int n1,n2=0;
		System.out.print("Teclea el primer número ");
		n1=e.nextInt();
		System.out.print("Teclea el segundo número ");
		n2=e.nextInt();
		System.out.print("Suma = "+suma(n1,n2)+"\n");
		

		System.out.println("*FIN DEL PROGRAMA*");
		e.close();

	}
}