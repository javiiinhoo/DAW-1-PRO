package busquedasecuencial;

import java.util.Scanner;
public class BusquedaSecuencial{
	public static void main(String[] args) {
	   Scanner e =  new Scanner(System.in);	    
	   int num[] = new int[12],i=0,nb=0,sw=0;	 
	   for(i=0;i<12;i++) {
		   System.out.print("Teclea valor de v["+(i+1)+"])?");
		   num[i]=e.nextInt();	
	   }
	   System.out.print("Teclea valor de nb?");
	   nb=e.nextInt();	
	   for(i=0;i<12;i++) {
		   if(num[i]==nb) {
			   i=12;
		   }	
	   }if (i==13) {
		   System.out.print("Sí existe");
	   }
	   else System.out.print("No existe");
	}
}