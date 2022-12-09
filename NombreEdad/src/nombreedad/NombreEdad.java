package nombreedad;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NombreEdad{
	//static final String ruta="C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\";
	static int menu(Scanner e,int tm) {
		int op = 0;
		switch (tm){ //tipo menú
		case 0:
			e=new Scanner(System.in);
			System.out.println("\n\tMENÚ\n\t====");
			System.out.println("1.Altas.");
			System.out.println("2.Listado.");
			System.out.println("3.Media.");
			System.out.println("4.Nombre del mayor y menor(Sin rep.)");
			System.out.println("5.OrdenarFichero.");
			System.out.println("6.Fin.");
			do {
				System.out.print("\n\tTeclee opción(1-6): ");
				op = e.nextInt();
			} while (op < 1 || op > 6);
			break;
		case 1:
			char oo=' '; //opción de ordenado
			System.out.println("\n\tORDENADO POR: \n\t==================\n");
			System.out.println("(N)ombre");
			System.out.println("(E)dad");
			do {
				System.out.println("\tTeclee opción (N/E): ");
				try {
					oo= Character.toLowerCase((char) System.in.read());
					while(System.in.read()!='\n');
				}catch (IOException ioe) {}
			}while (oo!='n' && oo!='e');
			op=(int)oo; //devolvemos el valor ascii del char porque tenemos un método int
			break;
		}
		e.nextLine();
		return op;
	}
	static void altas(Scanner e) {
		e= new Scanner(System.in);
		String nombre="",edad=""; 
		try {
			FileWriter es =new FileWriter("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\personas.txt",true);
			BufferedWriter esc= new BufferedWriter(es);	
			System.out.print("Teclea nombre(fin para acabar): ");
			nombre = e.nextLine();
			while(!nombre.equalsIgnoreCase("fin")) {
				esc.write(nombre);
				esc.newLine();					
				System.out.print("Teclea edad: ");
				edad = e.nextLine();
				esc.write(edad);
				esc.newLine();//grabo salto de línea
				System.out.print("Teclee nombre(fin para acabar): ");
				nombre=e.nextLine();
			}
			esc.close();
		}catch(IOException ioe) {}
	}
	static String tabular(String n)	{
		String t="\t\t\t";
		if(n.length()>=8)
			t="\t\t";
		return t;
	}
	static void listado() {
		String nombre="";
		String edad="";
		int car;
		try {
			BufferedReader 	leer= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\personas.txt"));
			System.out.println("\tLISTADO=========\n\n");	
			nombre=leer.readLine();
			while(nombre != null) {
				edad=leer.readLine();
				System.out.println(nombre+tabular(nombre)+edad);
				nombre=leer.readLine();
			}

			leer.close();
		}catch(IOException ioe) {
			System.out.println(ioe	.getMessage());
		}

	}
	static int mediaEdad() {
		Scanner e= new Scanner(System.in);
		String nombre="";
		String edad="";
		double media=0;
		int c=0;
		try {
			BufferedReader 	leer= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\personas.txt"));
			System.out.println("\tMEDIA EDAD\n\t=========\n");	
			nombre=leer.readLine();
			while(nombre != null) {
				edad=leer.readLine();
				System.out.println("Nombre = "+nombre+"  Edad = "+edad);
				try {	
					media+=Integer.parseInt(edad);	
				}catch(NumberFormatException nfe) {
					media+=0;
					c--;
				}
				c++;
				nombre=leer.readLine();
			}	
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		System.out.println("Número de personas: "+c+"     Media de su edad: "+(media/c));
		return c;
	}
	static String mayorMenor() {
		Scanner e= new Scanner(System.in);
		String nombre="";
		String edad="";
		String may="";
		String men="";
		double media=0;
		int mayor=0,menor=Integer.MAX_VALUE;
		try {
			BufferedReader leer= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\personas.txt"));
			nombre=leer.readLine();
			while(nombre != null) {
				edad=leer.readLine();
				try {			
					if(Integer.parseInt(edad)>mayor) {					
						mayor=Integer.parseInt(edad);
						may=nombre;
					}
					if(Integer.parseInt(edad)<menor) {
						menor=Integer.parseInt(edad);
						men=nombre;
					}				
				}catch(NumberFormatException nfe) {

				}
				nombre=leer.readLine();
			}

			System.out.println("El mayor es :"+may+" y tiene: "+mayor+" años.");
			System.out.println("El menor es :"+men+" y tiene: "+menor+" años.");
			leer.close();
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());			

		}

		return nombre;
	}
	static void ordenarArray(int n, String v[][],int tipo) {
		int i1=0,i2=0;
		String naux=" ", eaux=" ";
		for(i1=0;i1<n-1;i1++)
			for(i2=i1+1;i2<n;i2++) {
				if(tipo==0 && v[i1][0].compareToIgnoreCase(v[i2][0])>0 || tipo == 1 && Integer.parseInt(v[i1][1])> Integer.parseInt(v[i2][1])) {
					naux=v[i1][0];
					v[i1][0]=v[i2][0];					
					v[i2][0]=naux;	
					eaux=v[i1][1];
					v[i1][1]=v[i2][1];					
					v[i2][1]=eaux;	
				}
			}
	}
	static int numeroRegistros() {
		String nombre="";String edad="";
		int c=0;
		try {
			BufferedReader leer= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\personas.txt"));
			nombre=leer.readLine();
			while(nombre != null) {
				edad=leer.readLine();
				c+=1;
				nombre=leer.readLine();
			}
			leer.close();		

		}catch(IOException ioe) {}
		return c;
	}
	static void llenarFichero(String v[][],int n) {
		String nombre=null,edad=null;
		int i=0;
		try {
			BufferedWriter fic= new BufferedWriter(new FileWriter("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\personas.txt",false));
			for(i=0;i<v.length;i++) {
				nombre=v[i][0];
				edad=v[i][1];
				fic.write(nombre);
				fic.newLine();
				fic.write(edad);
				fic.newLine();
			}
			fic.close();
		}catch(IOException ioe) {}
	}
	static void ordenarFichero(int to) {	
		int nr=numeroRegistros(),i=0;
		String vOrdenar[][]= new String[nr][2];
		System.out.println();
		System.out.println();
		try {
			BufferedReader leer= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\personas.txt"));
			for(i=0;i<nr;i++){
				vOrdenar[i][0]=leer.readLine();
				vOrdenar[i][1]=leer.readLine();
			}
			leer.close();
		}catch(IOException ioe) {}
		ordenarArray(nr,vOrdenar,to);
		llenarFichero(vOrdenar,nr);
		System.out.println("\n Fichero ordenado...");
	}

	static void fin() {
		System.out.println("\n\tFIN DEL PROGRAMA\n\t=================");
	}
	public static void main(String[]args) {
		Scanner e= new Scanner(System.in);
		int op=0;
		do {
			op =menu(e,0);
			switch (op) {
			case 1:
				altas(e);	
				break;
			case 2:
				listado();
				break;
			case 3:
				mediaEdad();
				break;
			case 4:
				mayorMenor();
				break;
			case 5:
				op=menu(e,1);
				switch((char)op){
				case 'n':
					ordenarFichero(0);
					break;
				default:
					ordenarFichero(1);
				}
				break;
			case 6:
				fin();
			}
		}while(op!=6);
		e.close();
	}
}	