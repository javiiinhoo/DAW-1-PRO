package cajero;
import java.util.Scanner;
public class Cajero{
	public static void main(String[] args) {
	    Scanner e =  new Scanner(System.in);	    
	    int pa=0,pt=0,pag=0; /*pa precio articulo pt precio total pag precio pagado*/
	    do {
	   
	    	System.out.print ("Precio producto (0 para fin)?");
		    pa = e.nextInt(); 
		    pt=pt+pa;
		 }while (pa!=0);
	 	System.out.print ("\nTotal compra=>"+pt);
    	do {
		    System.out.print ("\n Cuánto entrega?");
		    pag = e.nextInt();	
		    if (pag<pt){
		    	System.out.print("Debe:" +(pt-pag)+"€");
		    }
		    }while(pag<pt);
    	System.out.print("\nSu vuelta es:" +(pag-pt)+"€");
	    e.close();    	
	}
}