package libros;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayLibros2{
	public static void main(String args) {
		Libros lib[]=new Libros[20];
		Scanner e= new Scanner(System.in);
		int op=0;
		op=menu(e);
		switch(op) {
		case 1:
			altas(e);
			break;
		case 2:
			visualizar(lib);
			break;
		case 3:
			int o=0;
			o=menuOrdenar(e);
			switch (o) {
			case 1:
				ordenarTitulo(lib);
				break;
			case 2:
				ordenarAutor(lib);
				break;
			case 3:
				ordenarPrecio(lib);
				break;
			default:
				break;
			}
		}
	}
	static void fin() {
		System.out.println("\nFIN DEL PROGRAMA\n=======================");
	}
	static void visualizar(Libros lib[]) {
		for(int i=0;i<19;i++)
			System.out.println(lib[i].getISBN()+"\t"+lib[i].getTitulo()+"\t"+lib[i].getAutor()+"\t"+lib[i].getTitulo()+"\t"+lib[i].getGenero()+"\t"+lib[i].getPrecio()+"\t");
	}
	static void ordenarTitulo(Libros lib[]) {
		int i1,i2=0;
		Libros aux=new Libros();
		System.out.println("Ordenando por título...");
		for(i1=0;i1<19;i1++)
			for(i2=i1+1;i2<20;i2++) {
				if(lib[i1].getTitulo().compareToIgnoreCase(lib[i2].getTitulo())>0){
					aux=lib[i1];
					lib[i1]=lib[i2];
					lib[i2]=aux;
				}
			}
	}
	static void ordenarAutor(Libros lib[]) {
		int i1,i2=0;
		Libros aux=new Libros();
		System.out.println("\nOrdenando por autor...");
		for(i1=0;i1<19;i1++)
			for(i2=i1+1;i1<20;i2++)
				if(lib[i1].getAutor().compareToIgnoreCase(lib[i2].getAutor())>0) {
					aux=lib[i1];
					lib[i1]=lib[i2];
					lib[i2]=aux;
				}
	}
	static void ordenarPrecio(Libros lib[]) {
		int i1,i2=0;
		Libros aux=new Libros();
		System.out.println("\nOrdenando por precio...");
		for(i1=0;i1<19;i1++)
			for(i2=i1+1;i1<20;i2++)
				if(lib[i1].getPrecio()>(lib[i2].getPrecio())) {
					aux=lib[i1];
					lib[i1]=lib[i2];
					lib[i2]=aux;
				}
	}
	static int menu (Scanner e) {
		int op=0;
		do {
			try {
				System.out.println("\n\tMENU\n\t====\n");
				System.out.println("1.-Altas.");
				System.out.println("2.-Visualizar.");
				System.out.println("3.-Ordenar.");
				System.out.println("4.-Fin.\n");
				System.out.println("\nTeclee una opción.");
				op=e.nextInt();
			}catch(InputMismatchException ime) {
				op=Integer.MAX_VALUE;
			}
		}while (op<1 || op>4 ||op==Integer.MAX_VALUE);
		return op;
	}
	static boolean comprobarISBN(String ISBN) {
		boolean valido=true;
		// declare variables
		int suma = 0;
		int multiplo = 0;
		char ch = '\0';
		int cifra = 0;
		for(int i=1; i<=13; i++) {
			if(i % 2 == 0)
				multiplo = 3;
			else multiplo = 1;
			ch = ISBN.charAt(i-1);
			cifra = Integer.parseInt(String.valueOf(ch));
			// addition
			suma += (multiplo*cifra);
		}
		// check sum
		if(suma%10 == 0)
			valido=true;
		if(valido)
			System.out.println(ISBN +" es un ISBN válido.");
		else
			System.out.println(ISBN +" no es un ISBN válido.");
		return valido;
	}
	static int menuOrdenar(Scanner e) {
		int op=0;
		do {
			try {	
				System.out.println("\n\tMENU ORDENAR\n\t============\n");
				System.out.println("1.-Por titulo.");
				System.out.println("2.-Por autor.");
				System.out.println("3.-Por precio.");
				System.out.println("4.-Volver a Menú Principal.\n");
				op=e.nextInt();
			}catch(InputMismatchException ime) {
				op=Integer.MAX_VALUE;
			}
		}while (op<1 || op>4 ||op==Integer.MAX_VALUE);
		return op;
	}
	static void altas(Scanner e){
		System.out.println("ALTAS");
		String autor="",genero="",titulo="",ISBN="";
		double precio=0;
		for(int i=0;i<20;i++) {
			Libros lib[]=new Libros[20];
			do {
				System.out.println("Teclee un ISBN. ");
				ISBN=e.nextLine();
			}while(ISBN.length()<1 || ISBN.length()>20 && comprobarISBN(ISBN));
			do {
				System.out.println("Teclee un autor. ");
				autor=e.nextLine();
			}while(autor.length()<1 || autor.length()>20);
			do {
				System.out.println("Teclee un autor. ");
				autor=e.nextLine();
			}while(autor.length()<1 || autor.length()>20);
			do {
				System.out.println("Teclee un titulo. ");
				titulo=e.nextLine();
			}while(titulo.length()<1 || titulo.length()>20);
			do {
				System.out.println("Teclee un género. ");
				genero=e.nextLine();
			}while(genero.length()<1 || genero.length()>20);
			do {
				try {
				System.out.println("Teclee un precio. ");
				precio=e.nextDouble();
				}catch(NumberFormatException nfe) {
					precio=Double.MAX_VALUE;
				}
			}while(precio<0 || precio==Double.MAX_VALUE);
			lib[i].setAutor(autor);
			lib[i].setGenero(genero);
			lib[i].setTitulo(titulo);
			lib[i].setPrecio(precio);
			lib[i].setISBN(ISBN);

		}
	}
}