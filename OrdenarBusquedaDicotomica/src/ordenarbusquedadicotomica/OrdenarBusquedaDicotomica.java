package ordenarbusquedadicotomica;
import java.util.Scanner;
public class OrdenarBusquedaDicotomica{
	public static void main(String[] args) {
		Scanner e =  new Scanner(System.in);	    
		int num[]=new int [10],i=0,j=0,nb=0,ii=0,id=9,im=0,sw=0;	   
		for (i=0;i<10;i++) {
			System.out.print ("Teclea número para la posición " +(i+1));
			num[i] = e.nextInt(); 		    
		}
		for (i=0;i<10; i++) 
			for (j=i+1; j<10;j++) 
				if (num[i] < num[j]) {
					int aux = num[i];
					num[i] = num[j];
					num[j] = aux;
				}

		System.out.println("Una vez ordenados:");
		for (i=0;i<10; i++) {
			System.out.print(i+" ");
		}	   System.out.print("\n"+"Teclea valor de nb?");
		nb=e.nextInt();
		ii=0;
		id=9;
		do {
			im=(ii+id)/2;
			System.out.println("nb= "+nb+" v["+im+"]");
			if (nb==num[im])
				sw=1;
			else
				if (nb>num[im])
					ii=im+1;
				else
					id=im-1;
		} while (ii<=id && sw==0);
		if (sw==1)
			System.out.println("Existe");
		else
			System.out.println("No existe");
		e.close();
	}
}	 