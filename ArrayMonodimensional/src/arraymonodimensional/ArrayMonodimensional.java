package arraymonodimensional;
import java.util.Scanner;
public class ArrayMonodimensional{
	public static void main(String[] args) {
	    Scanner e =  new Scanner(System.in);	    
	   int v[] = new int[7],i=0; /*si pones int[]v pues implica a todas las variables que estan con el, 
	   todo lo que lleve corchetes se verá incluido, entonces el i nos dará "problema", si ponemos i={0}, se convertirá en vector*/
	 
	   for(i=0;i<7;i++) {
		   System.out.print("Teclea valor de v["+i+"])?");
		   v[i++]=e.nextInt();	
	   }
	   for(i=6;i>=0;i--) {
		   System.out.println("v["+i+"])= "+ v[i] );
		   e.close();
	   }
	}
}
/*  do {
		   System.out.print("Teclea valor de v["+i+"])?");
		   v[i++]=e.nextInt();		   
	   }while(i<7);
	   do {		   
		   System.out.println("v["+i+"])= "+ v[--i] );
		 
	   }while(i>0);
	   e.close();*/