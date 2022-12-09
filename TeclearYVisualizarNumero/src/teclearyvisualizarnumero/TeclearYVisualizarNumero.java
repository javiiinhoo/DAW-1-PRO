package teclearyvisualizarnumero;
import java.util.Scanner;
public class TeclearYVisualizarNumero{
	public static void main(String[] args) {
	    Scanner entrada =  new Scanner(System.in);
	    int numero = 0;
	    System.out.print ("Teclea un número ");
	    numero = entrada.nextInt();
	    System.out.println("El número introducido es:" +numero);
	    entrada.close();
	}
}