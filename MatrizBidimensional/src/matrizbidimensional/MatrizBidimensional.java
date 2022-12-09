package matrizbidimensional;
import java.util.Scanner;
public class MatrizBidimensional{
	public static void main(String[]args) {
		Scanner e= new Scanner(System.in);
		int m[][]=new int[6][4],ifi=0,ico=0;
		for (ifi=0;ifi<6;ifi++) {
			for (ico=0;ico<4;ico++) {
				do {
					System.out.print("Teclea elemento m["+(ifi+1)+"]["+(+ico+1)+"]?");
					m[ifi][ico]=e.nextInt();
					if(m[ifi][ico]<1 ||m[ifi][ico]>55) {
						System.out.println("Número introducido no válido, escriba otro número");
						
					}
					} while (!(m[ifi][ico]>=1 && m[ifi][ico]<=99));

				} 
		}
				System.out.println("\n");
				for (ifi=0;ifi<6;ifi++) {
					for (ico=0;ico<4;ico++) {
						System.out.print(m[ifi][ico]+"\t");
					}
					System.out.print("\n");
				}
				e.close();
			}
		}
	