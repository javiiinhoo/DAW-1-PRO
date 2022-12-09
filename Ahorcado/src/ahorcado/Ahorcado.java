package ahorcado;
import java.util.Scanner;
import java.io.IOException;
public class Ahorcado{
	static String teclearPalabra(Scanner e) {	
		String p;
		System.out.println("Introduzca una palabra");	
		p=e.next();
		return p;
	}	
	static char [] llenarVectorPalabra(String palabra) {
		char vp[]=palabra.toCharArray();
		return vp;
	}	
	static char[] llenarVectorGuiones(char[]p, int l) {
		char pg[]=new char[l];//palabraguiones
		int i=0;
		pg[i]=p[i];
		for(i=1;i<l-1;i++) {
			pg[i]='_';
		}// sale con el valor de l de la for
		pg[i]=p[i];// meter en la palabraguiones las letras de p[]
		return pg;
	}
	static void visualizarVector(char[]v, int l) {
		for(int i=0;i<l;i++)
			System.out.print(v[i]+" "); //espacio en blanco para no solapar los guiones
	}

	static char teclearLetra() {	
		char letra=' ';
		try {
			letra =(char) System.in.read();
			while(System.in.read()!='\n');
		}catch(IOException ex) { }
		return letra;
	}
	static int[] buscarLetra(char p[],char va[], char vf[], char l,int cont[]){
		boolean existe= false;
		for(int il=1;il<va.length-1;il++) {
			if(l==p[il] && l!=va[il]) {
				existe=true;
				va[il]=p[il];
				cont[0]++;

			}
		}
		if(existe)
			System.out.println("Sigue intentando.");

		if(!existe) {
			cont[1]++;
			vf[cont[1]]=l;
			System.out.println("Tienes: "+(vf.length-2)+" intentos");
		}

		return cont;}
	public static void main(String[]args) {
		Scanner e=new Scanner(System.in);
		char[] palabra,paciertos,pfallos;
		char letra=' ', op=' ';
		String pal=null;
		int il=0,longpal=0,contador[]= {0,0};

		do {
			pal=teclearPalabra(e);
			longpal=pal.length();
			palabra=llenarVectorPalabra(pal);
			paciertos=llenarVectorGuiones(palabra,longpal);
			pfallos=llenarVectorGuiones(palabra,longpal);
			System.out.println("\n\n");		
			do {
				visualizarVector(paciertos,longpal);
				System.out.println("\n");
				visualizarVector(pfallos,longpal);
				System.out.println();
				System.out.println("\nTeclee una letra: ");
				letra=teclearLetra();
				contador=buscarLetra(palabra,paciertos,pfallos,letra,contador);
			}while(contador[1]<longpal-1 && contador[0]<longpal-2); // cuando llenas todas las letras en el vector fallos tienes una "vida" más, por eso es longpal-2
			if(contador[1]<longpal-1)
				System.out.println("\nPalabra acertada. \n La palabra a buscar era:"+pal);
			else
				System.out.println("\nPalabra no acertada. \n La palabra a buscar era:"+pal);
			do {
				System.out.println("Otra partida¿? (S/N) ");
				try {
					op=Character.toUpperCase((char)System.in.read());
					while(System.in.read()!='\n');
				}catch(IOException ioe) {}
			}while(op!='S' && op!='N');
		}while(op=='S');
		contador[0]= 0;
		contador[1]= 0;
		e.close();
	}
}