 package hombresmujeres;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class HombresMujeres{
	static int menu(Scanner e) {
		int op = 0; 
		System.out.println("\n\t\tMENÚ\n==========================================");
		System.out.println("1.Altas personas.");
		System.out.println("2.Crear ficheros de hombres y mujeres.");
		System.out.println("3.Persona con mayor y menor edad.");
		System.out.println("4.Personas con edad por encima de la media.");
		System.out.println("5.Visualizar fichero Personas.");
		System.out.println("6.Visualizar fichero Hombres.");
		System.out.println("7.Visualizar fichero Mujeres.");
		System.out.println("8.Modificaciones.");
		System.out.println("9.Fin.");
		do {
			System.out.print("\n\tTeclee opción(1-9): ");
			op = e.nextInt();
		} while (op < 1 || op > 9);	
		e.nextLine();//vaciar buffer entrada
		return op;
	}	
	static void altas(Scanner e) {
		e= new Scanner(System.in);
		String nombre="";
		String edad=""; 
		char sexo=' ';
		boolean correcto=true;
		try {
			FileWriter es =new FileWriter("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\hombresmujeres.txt",true);
			BufferedWriter esc= new BufferedWriter(es);	
			do {
				System.out.print("Teclea nombre(fin para acabar): ");
				nombre = e.nextLine();
			}while(nombre.length()>15);
			while(!nombre.equalsIgnoreCase("fin")) {
				do {
					correcto=true;
					System.out.print("Teclea edad: ");
					edad = e.nextLine();
					try {
						Integer.parseInt(edad);						
					}catch(NumberFormatException nfe) {
						correcto=false;
					}
				}while(!correcto);
				do {
					System.out.print("Teclea sexo: ");
					sexo = Character.toUpperCase((char) System.in.read());;
					while(System.in.read()!='\n');
				}while(sexo!='V'&&sexo!='M');
				esc.write(nombre);
				esc.newLine();
				esc.write(edad);
				esc.newLine();
				esc.write(sexo);
				esc.newLine();
				e.nextLine();
				do {
					System.out.println("Nombre?");
					nombre= e.nextLine();
				}while(nombre.length()>15);
			}
			esc.close();
		}catch(IOException ioe) {}
	}
	static int numeroRegistros() {
		String nombre="",edad="",sexo="";
		int c=0;
		try {
			BufferedReader leer= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\hombresmujeres.txt"));
			nombre=leer.readLine();
			while(nombre != null) {
				edad=leer.readLine();
				sexo=leer.readLine();
				c++;
				nombre=leer.readLine();
			}
			leer.close();	
		}catch(IOException ioe) {}
		return c;
	}
	static void crearFicheros() {
		String nombre="";
		String edad="";
		String sexo="";
		System.out.println("Creando ficheros...");
		try {
			BufferedReader leer= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\hombresmujeres.txt"));
			BufferedWriter grabarV= new BufferedWriter(new FileWriter("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\hombres.txt"));
			BufferedWriter grabarM= new BufferedWriter(new FileWriter("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\mujeres.txt"));
			nombre=leer.readLine();
			while(nombre != null)  {
				edad=leer.readLine();
				sexo=leer.readLine();
				if(sexo.equals("V")) {
					grabarV.write(nombre);
					grabarV.newLine();		
					grabarV.write(edad);
					grabarV.newLine();//grabo salto de línea
					grabarV.write(sexo);
					grabarV.newLine();//grabo salto de línea
				}
				else {
					grabarM.write(nombre);
					grabarM.newLine();		
					grabarM.write(edad);
					grabarM.newLine();//grabo salto de línea
					grabarM.write(sexo);
					grabarM.newLine();//grabo salto de línea
				}
				nombre=leer.readLine();
			}
			leer.close();
			grabarV.close();
			grabarM.close();	
		}catch(IOException ioe) {}

		System.out.println("Ficheros creados...");		
	}
	static void visualizar(int tv) {
		String nombre="";
		String edad="";
		String sexo="";
		String fichero="";
		switch (tv) {
		case 0:
			fichero="hombresmujeres.txt";
			break;
		case 1:
			fichero="hombress.txt";
			break;
		case 2:
			fichero="mujeres.txt";
			break;
		}		
		try {
			BufferedReader 	leer= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\"+fichero));
			System.out.println("\tLISTADO=========\n\n");	
			nombre=leer.readLine();
			while(nombre != null) {
				edad=leer.readLine();
				sexo=leer.readLine();
				System.out.println(nombre+tabular(nombre)+edad+"\t"+sexo);
				nombre=leer.readLine();			}
			leer.close();
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}
	static String tabular(String n)	{
		String t="\t\t\t";
		if(n.length()>=8)
			t="\t\t";
		return t;
	}
	static String mayorMenor() {
		Scanner e= new Scanner(System.in);
		String nombre="";
		String edad="";
		String sexo="";
		String may="";
		String men="";
		String sexoMax="";
		String sexoMen="";
		double media=0;
		int mayor=0,menor=Integer.MAX_VALUE;
		try {
			BufferedReader leer= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\hombresmujeres.txt"));
			nombre=leer.readLine();
			while(nombre != null) {
				edad=leer.readLine();
				try {			
					if(Integer.parseInt(edad)>mayor) {					
						mayor=Integer.parseInt(edad);
						may=nombre;
						sexo=leer.readLine();
						sexoMax=sexo;
					}
					if(Integer.parseInt(edad)<menor) {
						menor=Integer.parseInt(edad);
						men=nombre;
						sexo=leer.readLine();
						sexoMen=sexo;

					}				
				}catch(NumberFormatException nfe) {

				}
				nombre=leer.readLine();
			}
			System.out.println("El mayor es :"+may+" ,tiene: "+mayor+" años.");
			System.out.println("El menor es :"+men+" ,tiene: "+menor+" años.");
			leer.close();
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());			
		}
		return nombre;
	}
	static int media() {
		String nombre="";
		String edad="";
		String sexo="";
		int suma=0;
		int c=0;
		try {
			BufferedReader 	leer= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\hombresmujeres.txt"));	
			nombre=leer.readLine();
			while(nombre != null) {
				edad=leer.readLine();
				sexo=leer.readLine();
				suma+=Integer.parseInt(edad);
				c+=1;
				nombre= leer.readLine();
			}
			leer.close();
		}catch(IOException ioe) {}
		return suma/c;
	}
	static void edadMedia() {
		int media=media();
		String nombre="";
		String edad="";	
		String sexo="";
		media();
		System.out.println("LISTADO\n=======");
		System.out.println("Media "+ media);
		try {
			BufferedReader 	leer= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\hombresmujeres.txt"));	
			nombre=leer.readLine();
			while(nombre != null) {
				edad=leer.readLine();
				sexo=leer.readLine();
				if(Integer.parseInt(edad)> media)
					System.out.println(nombre+tabular(nombre)+edad+"\t"+sexo);
				nombre=leer.readLine();		
			}
			leer.close();
		}catch(IOException ioe) {	}
	}

	static void cargaVPersonas(HombreMujer hm[]) {
		String nombre=null,edad=null,sexo=null;
		int e=0;
		char s=0;
		int i=0;
		try {
			BufferedReader fich= new BufferedReader(new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\hombresmujeres.txt"));
			nombre=fich.readLine();
			while(nombre!=null) {
				edad=fich.readLine();
				sexo=fich.readLine();
				e=Integer.parseInt(edad);
				s=sexo.charAt(0);
				hm[i++]= new HombreMujer(nombre,e,s);
				nombre=fich.readLine();
			}		
			fich.close();
		}catch(IOException ioe) {}
		for(i=0;i<hm.length;i++) {
			System.out.println(hm[i].getNombre()+hm[i].getEdad()+hm[i].getSexo());
		}

	}
	static int buscarPersona(String nb,HombreMujer hm[]) {
		int i=0;
		while(!nb.equalsIgnoreCase(hm[i++].getNombre()) && i<hm.length);
		if(i==hm.length) i++;
		return --i;
	}
	static void grabarFichero(HombreMujer hm[]) {
		System.out.println();
		try {
			BufferedWriter grabar= new BufferedWriter(new FileWriter("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programación\\textos\\hombresmujeres.txt"));
			for(int i=0;i<hm.length;i++) {
				grabar.write(hm[i].getNombre());
				grabar.newLine();
				grabar.write(Integer.toString(hm[i].getEdad()));
				grabar.newLine();
				grabar.write(hm[i].getSexo());
				grabar.newLine();
			}
			grabar.close();
		}catch(IOException ioe) {}
	}
	static void modificar(Scanner e) {
		String nombreBus=null,nombreN=null;
		int edadN=0;
		char sexoN=' ';
		int ip=0,cm=0;
		char otro=' ';
		boolean correcto= true;
		HombreMujer hm[]= new HombreMujer[numeroRegistros()];
		cargaVPersonas(hm);
		System.out.println("MODIFICACIONES....");	
		do {
			System.out.println("¿Nombre de la persona a modificar?");
			nombreBus=e.nextLine();		
			ip=buscarPersona(nombreBus, hm);
			if(ip==hm.length)
				System.out.println("La persona con nombre /"+nombreBus+"\" no existe.");
			else {
				System.out.println("Nombre............"+hm[ip].getNombre()+"\nEdad............"+hm[ip].getEdad()+"\nSexo............"+hm[ip].getSexo());
				nombreN=hm[ip].getNombre();
				edadN=hm[ip].getEdad();
				sexoN=hm[ip].getSexo();			
				do {
					do {
						System.out.println("Teclear campo a modificar(1-3)?");
						cm=e.nextInt();		
						e.nextLine();								
					}while(cm<1||cm>3);
					switch(cm) {
					case 1:
						do {
							System.out.println("Teclee el nuevo nombre.");
							nombreN=e.nextLine();
						}while(nombreN==null);
						break;
					case 2:
						do {
							correcto=true;
							System.out.println("Teclee la nueva edad");
							try {
								edadN=e.nextInt();
							}catch(NumberFormatException nfe) {
								correcto= false;
							}
						}while(!correcto);	
						break;
					default:
						do {
							System.out.println("Teclee el nuevo sexo.");
							sexoN=Character.toUpperCase(e.next().charAt(0));
						}while(sexoN!='V' && sexoN!='M');
						break;				
					}
					do {
						System.out.println("Modificar otro campo¿? (S/N)");
						otro=Character.toUpperCase(e.next().charAt(0));
					}while(otro !='S' && otro!='N');
				}while(otro=='s');
				do {
					System.out.println("Confirmar modificaciones¿? (S/N) ");
					otro=Character.toUpperCase(e.next().charAt(0));
				}while(otro !='S' && otro!='N');	
				if(otro=='s') {
					hm[ip]= new HombreMujer(nombreN,edadN,sexoN);
				}
				do {
					System.out.println("Modificar otro registro(S/N)");
					otro=Character.toUpperCase(e.next().charAt(0));
				}while(otro !='S' && otro!='N');
			}while (otro=='s');
			grabarFichero(hm);
		}while (otro=='s');
	}
	static void fin() {
		System.out.println("\n\tFIN DEL PROGRAMA\n\t=================");
	}
	public static void main(String []args) {
		Scanner e= new Scanner(System.in);
		int op=0;
		do {
			op =menu(e);
			switch (op) {
			case 1:
				altas(e);	
				break;
			case 2:
				crearFicheros();
				break;
			case 3:
				mayorMenor();
				break;
			case 4:
				edadMedia();
				break;
			case 5:
				visualizar(0);
				break;
			case 6:
				visualizar(1);
				break;
			case 7:
				visualizar(2);
				break;
			case 8:
				modificar(e);
				break;
			case 9:
				fin();
			}
		}while(op!=9);
		e.close();
	}
}