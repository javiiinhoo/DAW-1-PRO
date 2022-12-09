package vocalesasteriscos;
import java.util.Scanner;
public class VocalesAsteriscos{
	static String teclearFrase(Scanner e) {	
		String p;
		System.out.println("Introduzca una frase");	
		p=e.next();
		return p;	
	}	
	static char [] llenarVectorPalabra(String palabra) {
		char vp[]=palabra.toCharArray();
		return vp;
	}	
	static char[] llenarVectorAsteriscos(char[]p, int l) {
		char pa[]=new char[l];
		int i=0;
		pa[i]=p[i];		
		
		switch (pa[i]) {
		case 'Á','a','A','á','É','e','E','é','i','I','í','Í','o','O','ó','Ó','u','U','ú','Ú','Ü','ü':
			p[i]='*';
		default:
			
			System.out.print(p[i]+"");
		}// meter en la palabraasteriscos las letras de p[]
		return pa;
	}
	static void visualizarVector(char[]v, int l) {
		System.out.println("Frase modificada: ");
		for(int i=0;i<l;i++)
			System.out.print(v[i]+" "); //espacio en blanco para no solapar los asteriscos
	}
	public static void main(String[]args) {
		char[] frase,frasemod;
		char letra=' ', op=' ';
		Scanner e=new Scanner(System.in);
		int longfra;
		String fra=null;
		do {
			fra=teclearFrase(e);
			longfra=fra.length();
			frase=llenarVectorPalabra(fra);
			frasemod=llenarVectorAsteriscos(frase,longfra);		
			System.out.println("Otra partida¿? (S/N) ");
			op=e.next().charAt(0);

		}while(op=='S');

	}
}