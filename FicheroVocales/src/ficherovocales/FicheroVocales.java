package ficherovocales;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FicheroVocales{
	//static final String ruta="C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\";

	static int menu(Scanner e) {
		System.out.println("\tMENU \n\n \t===== \n1.-Crear fichero\n2.-Leer fichero\n3.-Contar vocales\n4.-Fin\n");
		int op=0;
		do {
			System.out.print("\t Teclee opción(1-4)?");
			op=e.nextInt();
		}while(op<1 || op>4);
		e.nextLine(); // si no estuviera aquí haría falta en el method teclear pues no cerrarías tuberia.
		return op;
	}
	static String crearFichero(String texto) {
		System.out.println("Crear fichero.");
		int car=0;
		try {			
			FileWriter esc=new FileWriter("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\textovocal.txt",true);

			System.out.println("Teclear texto a grabar: ");
			car=(char) System.in.read(); //grabando carácter a carácter.
			while(car!='*') {
				esc.write(car);
				car=(char) System.in.read();
			}
			esc.close();
		}catch(IOException ioe) { //ioe:inputoutput exception
			System.out.println(ioe.getMessage());
		}
		return texto;
	}
	static String leerFichero(String texto) {
		System.out.println("Leer fichero.");
		int car=0;
		try {
			FileReader in =new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\textovocal.txt");
			car= in.read();
			while(car!=-1) { //si no logra leer nada, devuelve el m-1, mientras no sea -1 es que está leyendo
				texto+=(char)car;
				System.out.println((char)car);
				car=in.read();
			}
			System.out.println("El texto leído caracter a caracter es....: "+texto);
			in.close();
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return texto;
	}
	
	static int contarVocales() {
		int car,c=0;
		try {
			FileReader in =new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\textovocal.txt");
			car= in.read();
			while(car!=-1) { //si no logra leer nada, devuelve el m-1, mientras no sea -1 es que está leyendo
				switch(Character.toLowerCase((char)car)) {
				case'a','e','i','o','u','á','é','í','ó','ú','ü':
					c++;				
				}
				car=in.read();
			}
			in.close();
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return c;
	}

	static void fin() {
		System.out.println("\n\n Fin del programa.");
		System.exit(0);
	}
	public static void main(String[]args) {
		Scanner e= new Scanner (System.in);
		String texto=null;
		int opc=0,c=0;
		do {
			opc=menu(e);
			switch (opc) {
			case(1):
				crearFichero(texto);
			break;
			case(2):
				leerFichero(texto);
			break;
			case(3):
				c=contarVocales();
			System.out.println("En el fichero hay "+c+" vocales.");
			break;
			case(4):
				fin();
			break;			
			}
		}while(opc!=4);
	}
}