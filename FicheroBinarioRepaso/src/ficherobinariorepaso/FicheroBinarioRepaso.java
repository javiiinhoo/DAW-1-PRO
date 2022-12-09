package ficherobinariorepaso;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class FicheroBinarioRepaso{
	static final String ruta="G:\\Mi unidad\\PROGRAMACIÓN\\EJERCICIOS\\3ª EV\\textos\\"; //DOBLE BARRA FINAL ACUÉRDATE
	static int menu(Scanner e) {
		int op=0;
		System.out.println("\n\tMENU\n\t====");
		System.out.println("1.Altas.");
		System.out.println("2.Listado animales.");
		System.out.println("3.Listado animales por raza (fichero).");
		System.out.println("4.Crear lista.");
		System.out.println("5.Visualizar lista.");
		System.out.println("6.Fin.");
		do {
			try {
				System.out.println("\n\tTeclee opción (1-6): ");
				op=e.nextInt();
			}catch(InputMismatchException ime){
				op=Integer.MIN_VALUE;
			}
		}while(op<1||op>6);
		e.nextLine();
		return op;
	}
	public static void main(String []args) throws IOException {
		Scanner e= new Scanner(System.in); 
		List<String>l=new ArrayList<>();
		int op=0;		
		do {
			op=menu(e);
			switch(op) {
			case 1:
				altas(e);
				break;
			case 2:
				listado();
				break;
			case 3:
				listadoRaza(e);
				break;
			case 4:
				crearLista(l);
				break;
			case 5:
				visualizarLista(l);
				break;
			default:
				fin();
				break;
			}
		}while(op!=6);
	}
	static void altas(Scanner e) {
		String nombre=null, raza=null;
		int edad=0;
		System.out.println("\n\tALTAS\n\t=====");
		try {
			DataOutputStream ent=new DataOutputStream(new FileOutputStream(ruta+"animales.dat",true));
			System.out.println("Teclee nombre (**) para terminar: ");
			nombre=e.nextLine();				
			while(!nombre.equals("**")) {
				if(!nombre.equals("**")) { 
					do {
						try {
							System.out.println("Teclee edad: ");
							edad=e.nextInt();
						}catch(InputMismatchException ime){
							edad=Integer.MIN_VALUE;
						}
					}while(edad==Integer.MIN_VALUE);	
					do {
						System.out.println("Teclee raza: ");
						raza=e.next();
					}while(raza.length()>30);
					e.nextLine();
					ent.writeUTF(nombre);		
					ent.writeInt(edad);
					ent.writeUTF(raza);

				}
				System.out.println("Teclee nombre (**) para terminar");
				nombre=e.nextLine();	
			}
			ent.close();
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
	static void listado() {
		String n=null,r=null;
		int e=0;
		System.out.println("\n\tLISTADO\n\t=======");
		try {
			DataInputStream sal= new DataInputStream(new FileInputStream(ruta+"animales.dat"));
			System.out.println("Nombre\tEdad:\tRaza:");
			n=sal.readUTF();
			while(n!=null) {
				e=sal.readInt();
				r=sal.readUTF();
				System.out.println(n+"\t"+e+"\t"+r);
				n=sal.readUTF();
			}
			sal.close();			
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
	static void listadoRaza(Scanner e) {
		String n=null,r=null,rBus=null;
		int ed=0;
		System.out.println("\n\tLISTADO RAZA\n\t============");
		do {
			System.out.println("Teclee raza a listar: ");
			rBus=e.nextLine();
		}while(rBus==null);
		try {
			DataInputStream sal= new DataInputStream(new FileInputStream(ruta+"animales.dat"));
			System.out.println("Nombre\tEdad:\tRaza:");
			n=sal.readUTF();
			while(n!=null) {
				ed=sal.readInt();
				r=sal.readUTF();
				if(r.equalsIgnoreCase(rBus))
					System.out.println(n+"\t"+e+"\t"+r);
				n=sal.readUTF();
			}
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}
	static void crearLista(List<String> l){
		String n=null,e=null,r=null;
		System.out.println("\nCreando lista...");
		//LLENAR LISTA
		try {
			DataInputStream lee= new DataInputStream(new FileInputStream(ruta + "animales.dat"));
			n=lee.readUTF();
			while(n!=null) {
				l.add(n);
				e=Integer.toString(lee.readInt());
				l.add(e);
				r=lee.readUTF();
				l.add(r);
				n=lee.readUTF();
			}
			lee.close();
		}catch(IOException ioe) {}
		System.out.println("La lista fue creada. ");
	}
	static void crearLaLista(List<String>l) {
		l.clear();
		System.out.println("\n\tCREAR LISTA\n\t===========");
		System.out.println("\n\tCreando lista....");
		crearLista(l);
		System.out.println("\n\tLista creada...."+l);
		System.out.println("\n\tTamaño de la lista...."+l.size()/3);

	}
	static void visualizarLista(List<String> l) {
		System.out.println("\n\tVISUALIZAR LISTA\n\t================");
		System.out.println("Nombre\tEdad\tRaza ");
		if(l.isEmpty())
			System.out.println("Lista ----> [Vacía]");
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+"\t");
			if(i-1%3==1)
				System.out.println();
		}
	}
	static void fin() {
		System.out.println("\n\tFIN DEL PROGRAMA\n\t================");
	}
}