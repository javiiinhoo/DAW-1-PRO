package matrizbidimensional;
import java.util.Scanner;
public class MatrizBidimensionalPredefinida{
	public static void main (String[]args) {
		Scanner entrada= new Scanner(System.in);
		int m[][] = new int[4][6], ifi=0, ico=0;
		// int[][]={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}}

		for(ifi=0;ifi<4;ifi=ifi+1) {
			for(ico=0;ico<6;ico=ico+1) {
				System.out.println("Teclea el elemento m["+ifi+"] ["+ico+"]: ");
				m[ifi][ico]=entrada.nextInt();
			}
		}
		System.out.println("\n");
		for (ifi=0;ifi<4;ifi=ifi+1) {
			for(ico=0;ico<6;ico=ico+1) {
				System.out.println(m[ifi][ico]+"\t");
			}
			System.out.println("\n");
		}
		entrada.close();
	}
}

