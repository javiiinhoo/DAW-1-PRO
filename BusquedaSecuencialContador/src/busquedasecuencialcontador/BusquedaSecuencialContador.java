package busquedasecuencialcontador;
import java.util.Scanner;
public class BusquedaSecuencialContador{
	public static void main(String[] args) {
	   Scanner e =  new Scanner(System.in);	    
	   int num[] = {12,34,65,12,19,4,1,33,27,22,5,62},i=0,nb=0,c=0;  
	   for (i=0;i<12;i++) {
		   System.out.print ("Teclea número para la posición " +(i+1));
		    num[i] = e.nextInt(); 	
		    
	   }
	   System.out.print("\n"+"Teclea valor de nb?");
	   nb=e.nextInt();
	   for(i=0;i<12;i++) {		   
	   	if(nb==num[i]) {	   	
	   		c++;}
	   }
	    if(c==0)
		   System.out.print("Número no encontrado");
	   
	   else System.out.print("Número encontrado, "+"aparece "+c+" veces.");
	    e.close();
	} 
}