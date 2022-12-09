package busquedasecuencialswitch;

import java.util.Scanner;
public class BusquedaSecuencialSwitch{
	public static void main(String[] args) {
	   Scanner e =  new Scanner(System.in);	    
	   int num[] = {12,34,65,76,19,4,1,33,27,22,5,62},i=0,nb=0,sw=0;
	   
	   for(i=0;i<12;i++) {
		   System.out.print("\t"+num[i]);
		
	   }
	   System.out.print("\n"+"Teclea valor de nb?");
	   nb=e.nextInt();	
	   i=0;
	   do {
		   if(nb==num[i++])
			   sw=1;
	   }while(i<12 && sw==0);
	   //for(i=0;i<12 &&sw==0;i++)
	   //	if(nb==num[i]
	   //		sw=1; esto es lo mismo que lo del do while
	   
		if (sw==1) 
		   System.out.print("Número encontrado");
	   
	   else System.out.print("Número no encontrado");
	}
}