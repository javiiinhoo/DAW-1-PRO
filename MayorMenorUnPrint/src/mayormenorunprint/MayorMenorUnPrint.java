package mayormenorunprint;
import java.util.Scanner;
public class MayorMenorUnPrint {
public static void main(String[] args) {
    Scanner entrada =  new Scanner(System.in);
    int num,num2,c=0;
    System.out.print ("Teclea un n�mero ");
    num = entrada.nextInt();
    System.out.print ("Teclea otro n�mero ");
    num2 = entrada.nextInt();	 
    if (num>num2) {
    	c=num;
		num=num2;
		num2=c;	
    }
		System.out.println("El orden de los n�meros es: "+num+" < "+num2);
		entrada.close();
    
}
}
