package mayoramenor;

import java.util.Scanner;
public class MayorAMenor {
public static void main(String[] args) {
    Scanner entrada =  new Scanner(System.in);
    int num,num2=0;
    System.out.print ("Teclea un n�mero ");
    num = entrada.nextInt();
    System.out.print ("Teclea otro n�mero ");
    num2 = entrada.nextInt();	 
    if (num<num2) {
		System.out.println("El orden de los n�meros es: "+num+" < "+num2);
	} else {
		System.out.println("El orden de los n�meros es: "+num2+" < "+num);
	}
}
    
}

