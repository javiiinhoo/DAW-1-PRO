package contadores;
public class Contadores{
	public static void main(String[] args) {
	  int c=3, p=21;
	  System.out.println("c = "+ ++c); /*primero suma y luego visualiza*/
	  System.out.println("c = "+ c++); /*primero visualiza y luego suma */
	  System.out.println("c = "+ c); 
	  System.out.println("\n"); 
	  System.out.println("c = "+ --c); /*primero resta y luego visualiza*/
	  System.out.println("c = "+ c--); /*primero visualiza y luego resta */
	  System.out.println("c = "+ c); 
	  c*=p;
	  System.out.println("Producto = "+c);
	  c/=p;
	  System.out.println("División = "+c);
	} 
	}