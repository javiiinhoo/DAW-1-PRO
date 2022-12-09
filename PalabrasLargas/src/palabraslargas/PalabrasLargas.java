package palabraslargas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class PalabrasLargas{
	static String buscaPalabraLarga(String f) {
		int lf=f.length(); //longitud frase
		int lpl=0;
		String p="",pml="";
		for(int i=0;i<lf;i++) {
			if(f.charAt(i)!=' '&& i<lf-1) { //al llegar al último carácter no se cumple la if y salta al else.
				p+=f.charAt(i);
			}
			else { // una de las condiciones no se ha cumplido, pero no sabe cual, aquí discriminamos.
				if(i==lf-1)
					p+=f.charAt(i);
				if(p.length()>lpl) {
					lpl=p.length();
					pml = p;
				}
				p="";
			}
		}
		return pml;
	}
	static int crearFichero(Scanner e) {
		int nl=0;
		String frase;
		try {
			FileWriter esc =new FileWriter("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\palabras.txt");
			BufferedWriter be= new BufferedWriter(esc);	
			System.out.println("Escribe frases (\"*\" para finalizar): "); // barras para desactivar las comillas, que así no limiten las cadenas
			frase=e.nextLine();
			while(!frase.equals("*")) {
				be.write(frase);
				be.newLine();
				nl++;
				frase=e.nextLine();
			}			
			be.close();
		}catch(IOException ioe) {}
		return nl;
	}
	static void leerFichero(int lv) {
		String frase,pl="";
		String vpl[]=new String[lv];
		int nlinea[]=new int[lv];
		vpl[0]="";
		int ipl=0; //índice palabra larga
		try {
			BufferedReader bl= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\palabras.txt"));
			for(int lecturas=0;lecturas<lv;lecturas++) {
				frase = bl.readLine();
				pl=buscaPalabraLarga(frase);
				System.out.println(frase);
				if(pl.length() >= vpl[0].length()) {
					if(pl.length()>vpl[0].length()) { // te cumples por mayor¿? pues si es mayor el índice de la palabra más larga se pone a cero.
						ipl=0;
					}
					vpl[ipl]=pl;
					nlinea[ipl++]=lecturas+1; // una vez guardado, ipl se incrementa en uno.
				}
			}
			System.out.println("Palabras más largas: ");
			for (int i=0;i<ipl;i++)		
				System.out.println(vpl[i]+" en la línea número: "+nlinea[i]);
			bl.close();
		}catch(IOException ioe) {}

	}
	public static void main(String []args) {
		Scanner e= new Scanner(System.in);
		int nl=0;		
		nl=crearFichero(e);
		leerFichero(nl);
		e.close();
	}
}