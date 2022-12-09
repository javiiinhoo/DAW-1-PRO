package productosmeses;
import java.util.Scanner;
public class ProductosMeses{
	public static void main (String[]args){
		Scanner e= new Scanner(System.in);
		int v[][]=new int[12][6],im=0,ic=0,s=0,m=0,c=0;
		
		for (im=0;im<12;im++) {
			for (ic=0;ic<6;ic++) {
				System.out.print("Ventas en el mes "+(im+1)+"º del coche "+(ic+1)+"?");
				v[im][ic]=e.nextInt();
			}
		} 
		System.out.println("\n");
		for (im=0;im<12;im++) {
			for (ic=0;ic<6;ic++) {
				s+=v[im][ic];
			}
		}
		System.out.println("\nVenta total del año:"+s);
		for (ic=0;ic<4;ic++) {
			s=0;
			for (im=0;im<12;im++) {
				s+=v[im][ic];				
				if(s>m) {
					m=s;
					c=ic;
				}
			}
		} System.out.println("\nEl coche más vendido del año fue:"+c+" y el número de unidades fue de:"+m);
		m=0;		

		for (im=0;im<12;im++) {
			s=0;
			for (ic=0;ic<4;ic++) {
				s+=v[im][ic];
				if(s>m) {
					m=s;
					c=im;
				}
			}
		} System.out.println("\nEl mes en el que se vendieron más coches fue:"+(c+1)+" y el número de unidades fue de:"+m);
		s=0;
		do {		
			System.out.print("Teclea im? ");
			im=e.nextInt();
		}while(im<1 || im>12);		
		for (ic=0;ic<4;ic++) {
			s+=v[im-1][ic];				
		}
		System.out.println("\nDado el mes "+im+" en el cual se vendieron: "+s+" coches.");
		s=0;
		do {		
			System.out.print("Teclea marca de coche? ");
			ic=e.nextInt();
		}while(ic<1 || ic>4);
		do {		
			System.out.print("Teclea mes? ");
			im=e.nextInt();
		}while(im<1 || im>12);	

		System.out.println("Dado el mes "+im+" y la marca "+ic+" fueron vendidos un total de:"+v[im-1][ic-1]+" coches.1");
	}

	//int v[][]={{12,21,32,46},{11,20,31,45},{21,32,73,41},{71,12,63,74},{41,52,83,49},{91,12,43,54},{61,23,63,74},{71,22,34,45},{71,42,30,40},{10,26,34,46},{17,20,31,40},{10,28,83,49}};
			//int im=0,ic=0,s=0,m=0,c=0;
}
