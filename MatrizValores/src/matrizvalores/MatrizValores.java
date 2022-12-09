package matrizvalores;
import java.util.Scanner;
public class MatrizValores {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int m[][] = new int[6][4];
		int ifi = 0, ico = 0, num=0, cant=0, sum =0, max=0, min=55;
		for(ifi=0; ifi<6;ifi++) {
			for(ico=0; ico<4; ico++) {
				do {
					System.out.print("Teclee elemento m["+(ifi+1)+"]["+(ico+1)+"] (rango: 1-55)--> ");
					m[ifi][ico]=e.nextInt();
					if(m[ifi][ico]<1 || m[ifi][ico]>55){					
						System.out.println("Valor fuera de rango (1-55)");
						ico--;
					}
					

				}while(m[ifi][ico]<1 || m[ifi][ico]>55);		
			}
		}
		System.out.println("\n");
		for(ifi=0; ifi<6;ifi++) {
			for(ico=0; ico<4; ico++) {
				System.out.print(m[ifi][ico]+"\t");
			}
			System.out.println("\n");
		}

		do {
			System.out.print("\n\nTeclee el número a comparar (rango: 1-55)--> ");
			num = e.nextInt();
			if(num<1 || num>55){
				System.out.println("Valor fuera de rango (1-55)");
			}
		}while(num<1 && num>55);

		for(ifi=0; ifi<6;ifi++) {
			for(ico=0; ico<4; ico++) {
				if(m[ifi][ico]>=num) {
					cant++;
					sum += m[ifi][ico];
				}
				if(m[ifi][ico]>max) {
					max=m[ifi][ico];
				}
				if(m[ifi][ico]<min) {
					min=m[ifi][ico];
				}		
			}
		}
		System.out.println("\nHay "+cant+" números mayores o iguales que "+num);
		System.out.println("\nLa suma de todos los números mayores o iguales a "+num+" es "+sum);
		System.out.println("\nEl mayor número de la matriz es "+max);
		System.out.println("\nEl menor número de la matriz es "+min);

		e.close(); 	
	}

}