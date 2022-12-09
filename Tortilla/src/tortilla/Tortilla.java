package tortilla;
import java.util.Scanner;
public class Tortilla{
	static String[] llenarVector() {
		String pTP[]={"Freír patatas","Calentar aceite",
				"Pelar patatas","Poner sal",
				"Trocear patatas","Poner mezcla",
				"Mezclar patatas y huevo",
				"Batir huevos","Romper cáscara huevo"};
		return pTP;
	}
	static int [][] llenarMatrizControl(){
		int mC[][]= {{2,0,1},{3,0,1},{5,0,1},{4,0,1},{1,0,1},{9,0,1},{8,0,1},{7,0,1},{6,0,1}};
		return mC;
	}
	static void visualizarPasos(String[] p) {
		for (int i=0;i<9;i++) 
			System.out.println((i+1)+".- "+p[i]);
	}
	static boolean comprobarRepeticion(int mC[][],int i) {
		boolean repetido=false;
		for(int ir=0;ir<i &&!repetido;ir++)
			if(mC[ir][1]==mC[i][1])
				repetido=true;
		return repetido;
	}
	static void llenarRespuestas(int mC[][], Scanner e) {
		String nomPasos[]= {"primer","segundo","tercer","cuarto","quinto","sexto","séptimo","octavo","noveno"};
		for(int i=0;i<9;i++) {
			do {
				System.out.print("Teclee el "+nomPasos[i]+" paso(1-9)\t...:  ");
				mC[i][1]=e.nextInt();
			}while(comprobarRepeticion(mC,i)|| mC[i][1]<1 ||mC[i][1]>9);
			if(mC[i][0]==mC[i][1])
				mC[i][2]=0;
		}
	}	
	static void visualizarMatrizControl(int[][]m) {
		System.out.println("\n");
		for (int iPL=0;iPL<9;iPL++) 
			for (int iPC=0;iPC<9;iPC++)
				System.out.println(m[iPL][iPC]+"\t");
	}
	static void visualizarResultado(int [][] mC,String[] p) {
		System.out.println();
		boolean fallo=false;
		for(int i=0;i<9;i++) {
			if(mC[i][2]==1) {
				System.out.println("Fallo  "+p[mC[i][1]-1]+"\t\t sería: "+p[mC[i][0]-1]);
				fallo=true;
			}
		}
		if(!fallo)
			System.out.println("Ha acertado con toda la secuencia.");
	}
	public static void main(String[]args) {
		Scanner e= new Scanner(System.in);
		String pasos[]=llenarVector();
		int controlP[][]=llenarMatrizControl();
		visualizarPasos(pasos);
		//visualizarMatrizControl(controlP);
		System.out.println("\n\n");
		llenarRespuestas(controlP,e);
		//visualizarMatrizControl(controlP);
		System.out.println("\n\n");
		visualizarResultado(controlP,pasos);
		e.close();

	}
}

