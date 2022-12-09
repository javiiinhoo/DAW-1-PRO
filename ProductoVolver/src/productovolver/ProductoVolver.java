package productovolver;
import java.io.IOException;
import java.util.Scanner;
public class ProductoVolver{
	public static void main(String []args) {	
		Scanner e =  new Scanner(System.in);
		int a,b=0;
		char otro=' ';
		do {
			System.out.print ("Teclea un número ");
			a = e.nextInt();
			System.out.print ("Teclea otro número ");
			b = e.nextInt();	 
		
			System.out.print(a*b+"\n");
			do {
				System.out.print("Otro producto?(S/N)");
				try {				
					otro=Character.toLowerCase((char) System.in.read()); 
					while(System.in.read()!='\n');
				}catch(IOException ioe) {}
			}while(otro!= 's'&& otro!= 'n');
		}while(otro=='s');
		e.close();
	}
}
