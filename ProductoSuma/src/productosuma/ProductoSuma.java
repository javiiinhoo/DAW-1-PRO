package productosuma;
import java.util.Scanner;
public class ProductoSuma {
public static void main(String[] args) {
    Scanner entrada =  new Scanner(System.in);
    int num,num2=0;
    System.out.print ("Teclea un número ");
    num = entrada.nextInt();
    System.out.print ("Teclea otro número ");
    num2 = entrada.nextInt();	 
    entrada.close();
    }
}
