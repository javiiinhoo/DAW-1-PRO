package teclearyvisualizarnumero;
import java.util.Scanner;
public class TeclearYVisualizarNumero{
	public static void main(String[] args) {
	    Scanner entrada =  new Scanner(System.in);
	    int numero = 0;
	    System.out.print ("Teclea un n�mero ");
	    numero = entrada.nextInt();
	    System.out.println("El n�mero introducido es:" +numero);
	    entrada.close();
	}
}