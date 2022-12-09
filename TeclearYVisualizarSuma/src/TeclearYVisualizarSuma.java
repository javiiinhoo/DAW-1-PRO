
import java.util.Scanner;
public class TeclearYVisualizarSuma{
	public static void main(String[] args) {
	    Scanner entrada =  new Scanner(System.in);
	    int num,num2,sum = 0;
	    System.out.print ("Teclea un número ");
	    num = entrada.nextInt();
	    System.out.print ("Teclea otro número ");
	    num2 = entrada.nextInt();
	    sum=num+num2;
	    System.out.println("La suma de los dos números es:" +sum);
	    entrada.close();
	}
}