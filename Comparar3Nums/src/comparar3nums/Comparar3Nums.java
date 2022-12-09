package comparar3nums;
import java.util.Scanner;
public class Comparar3Nums {
public static void main(String[] args) {
    Scanner entrada =  new Scanner(System.in);
    int a,b,c,aux=0;
    System.out.print ("Teclea un primer número ");
    a = entrada.nextInt();
    System.out.print ("Teclea un segundo número ");
    b = entrada.nextInt();	
    System.out.print ("Teclea un tercer número ");
    c = entrada.nextInt();  
    if (a>b) {
    	aux=a;
    	a=b;
    	b=aux;
    }
	if (a>c) {
		aux=a;
		a=c;
		c=aux;
	}
	if (b>c) {
		aux=b;
		b=c;
		c=aux;
	}
	System.out.println("El orden de los números es: "+a+"<" +b+"<" +c ); 
	 entrada.close();
	}
    }