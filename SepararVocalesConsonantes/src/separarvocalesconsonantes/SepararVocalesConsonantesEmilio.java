package separarvocalesconsonantes;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SepararVocalesConsonantesEmilio {
	static int menu(Scanner e) {
		int opc=0;
		System.out.println("\n\tMENU\n\t======\n");
		System.out.println("1.-Crear fichero frase.");
		System.out.println("2.-Crear ficheros vocales y consonantes.");
		System.out.println("3.-Visualizar fichero frase.");
		System.out.println("4.-Visualizar fichero vocales.");
		System.out.println("5.-Visualizar fichero consonantes.");
		System.out.println("6.-Fin");

		do {
			System.out.print("\tTeclee opción(1-6)?");
			opc=e.nextInt();
		}while(opc<1 || opc>6);
		e.nextLine();
		return opc;
	}
	//Crear fichero frase COPIADO BIEN
	static void crearFichero() {
		int car=0;
		String texto=" ",textovoc=" ", textocons=" ";
		System.out.println("\n\tCREAR FICHERO\n\t==============\n\n");
		try {
			FileWriter esc=new FileWriter("C:\\\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\ficheroVocCon.txt",false);
			System.out.println("Teclear texto: ");
			car=(char) System.in.read();
			while(car!='*') {
				esc.write(car);
				car=(char) System.in.read();
			}
			esc.close();
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
	//NO COPIADO DEL TODO
	static void crearFicheroVocalesConsonantes() {
		int car=0;
		System.out.println("\n\tCREAR FICHERO VOCALES Y CONSONANTES\n\t==============\n\n");
		try {
			FileReader lee =new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\ficheroVocCon.txt");
			FileWriter escV=new FileWriter("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\ficheroVocales.txt");
			FileWriter escC=new FileWriter("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\ficheroConsonantes.txt");
			car=lee.read();
			while(car!=-1) {
				if(esVocal((char)car)) {
					escV.write(car);
					car=lee.read();
				}
				else
					if((char)car !=' ');
				escC.write(car);
				car=lee.read();
			}
			lee.close();
			escV.close();
			escC.close();
			}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

	//Comprobar si es vocal COPIADO BIEN
	static boolean esVocal(char c) {
		boolean vocal=false;
		int i =0;
		String vocales ="aeiouáéíóúü";
		char v[]=vocales.toCharArray();
		for(i=0;i<v.length && !vocal;i=i+1) {
			if(v[i]==Character.toLowerCase(c))
				vocal=true;
		}
		return vocal;
	}
	//COPIADO EL PRINCIPIO
	static void visualizarFichero(int tf) {
		String nombreFich="",texto= "";
		int car=0;
		switch(tf) {
		case 0:
			nombreFich="ficheroVocCon.txt";
			break;
		case 1:
			nombreFich="ficheroVocales.txt";
			break;
		case 2:
			nombreFich="ficheroConsonantes.txt";
			break;
		}
		System.out.println("\n\tVISUALIZAR FICHERO FRASE\n\t==============\n\n");
		try {
			FileReader in =new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\"+nombreFich);
			car= in.read();
			//-1 es el valor que se envía predeterminado cuando no hay más que leer
			while(car!=-1) {
				texto+=((char)car);
				System.out.print((char)car);
				car=in.read();
			}
			System.out.println();
			in.close();
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

	static void fin() {
		System.out.println("\n\tFIN DEL PROGRAMA\n\t=================");
	}
	//BIEN
	public static void main(String[]args) {
		Scanner e=new Scanner (System.in);
		int opc=0;
		do {
			System.out.println("Teclea una opción: ");
			opc=menu(e);
			switch(opc) {
			case 1:
				crearFichero();
				break;
			case 2:
				crearFicheroVocalesConsonantes();
				break;
			case 3:
				visualizarFichero(0);
				break;
			case 4:
				visualizarFichero(1);
				break;
			case 5:
				visualizarFichero(2);
				break;
			default:
				fin();

			}
		}while (opc!=6);
	}
}