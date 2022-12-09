package metodosconvectores;
import java.util.Scanner;
public class MetodosConVectores{
static void llenarVector(int vl[],Scanner e) {
	//static int[] llenarVector(int vl[],Scanner e) {
	for (int i=0;i<5;i++) {
		System.out.print((i+1)+"º número? ");
		vl[i]=e.nextInt();
	}
// return vl
}
static void VisualizarVector(int vv[],Scanner e) {
	System.out.print("Visualización de tabla");
	for (int i=0;i<5;i++) {
		System.out.print(vv[i]+"\t");
	}
}
public static void main(String[]args) {
	Scanner e = new Scanner(System.in);
	int v[]=new int [5];
	llenarVector(v,e);
	VisualizarVector(v,e);
	System.out.print("Fin del programa.");

}
}