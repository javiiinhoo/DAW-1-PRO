package llenadoarray;
import java.util.Scanner;
public class LlenadoArray{
	public static void main(String[] args) {
	    Scanner e =  new Scanner(System.in);	    
	    int i=0,s=0;
	    int vector[]=new int [10];	   
	   for (i=0;i<10;i++) {
	    	System.out.print ("Teclea n�mero para la posici�n " +(i+1));
		    vector[i] = e.nextInt(); 		    
	   }
	   for (i=0;i<10;i++)        
               s+= vector[i];  	   		  	       
	System.out.print("La suma de los n�meros introducidos es=>" +s);
	e.close();
	}
}
