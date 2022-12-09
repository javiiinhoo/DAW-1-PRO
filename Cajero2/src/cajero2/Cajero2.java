package cajero2;
import java.util.Scanner;
public class Cajero2{
	public static void main(String[] args) {
	    Scanner e =  new Scanner(System.in);
	    int pa=0,pc=0,pag=0,oc=0,pt=0,cc=0; /*pa precio articulo pc precio comora pag precio pagado pt precio total cc compra cliente oc otro cliente*/
	    do {
	    do {	   
	    	System.out.print ("Precio producto (0 para fin)?");
		    pa = e.nextInt(); 
		    pc+=pa;
		 }while (pa!=0);
	 	System.out.print ("\nTotal compra=>"+pc);
    	do {
		    System.out.print ("\n Cuánto entrega?");
		    pag = e.nextInt();	
		    if (pag<pc){
		    	System.out.print("Debe:" +(pc-pag)+"€");
		    }
		    }while(pag<pc);
    	System.out.print("Su vuelta es:" +(pag-pc)+"€\n");    	
    	do {
		  System.out.print ("\nOtro cliente (1=Sí // 0 No )?");
		    oc = e.nextInt(); 
    	}while(oc!=0 && oc!=1);
    	cc++;
    	pt +=pc;
    	pc=0;	  	    
	    }while (oc==1);
	    System.out.print("\n\n Total caja==>"+pt);    	
	    System.out.print("\n\n Total clientes==>"+cc);  
	    System.out.print("Media por cliente:" +pt/cc);    	
	   
	  
	} 
	}