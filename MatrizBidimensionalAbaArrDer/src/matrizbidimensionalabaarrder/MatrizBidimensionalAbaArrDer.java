package matrizbidimensionalabaarrder;
import java.util.Scanner;
public class MatrizBidimensionalAbaArrDer{
	public static void main(String[]args) {
		Scanner e= new Scanner(System.in);
		int m[][]=new int[4][6],ifi=0,ico=0;
	//	for (ifi=0;ifi<4;ifi++) {
	//		for (ico=0;ico<6;ico++) {
	//		System.out.print("Teclea elemento m["+ifi+"]["+ico+"]?");
	//		m[ifi][ico]=e.nextInt();
		
	for (ico=0;ifi<5;ico++) {
		for (ifi=3;ifi>=0;ifi--) {
			System.out.print(m[ifi][ico]+"\t");
		}
		System.out.print("\n");
		}
	e.close();
	
	}
}