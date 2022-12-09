package libros;
import java.util.Scanner;
public class ArrayLibros{
	static int menu(Scanner e) {
		int op = 0;
		System.out.println("\n\tMENU\n\t====\n");
		System.out.println("1.-Altas.");
		System.out.println("2.-Visualizar.");
		System.out.println("3.-Ordenar.");
		System.out.println("4.-Fin.\n");
		do {
			System.out.print("\tTeclee opción (1-4)? ");
			op = e.nextInt();
		}while(op<1 || op>4);
		return op;
	}
	static int menuOrdenar(Scanner e) {
		int op = 0;
		System.out.println("\n\tMENU ORDENAR\n\t============\n");
		System.out.println("1.-Por titulo.");
		System.out.println("2.-Por autor.");
		System.out.println("3.-Por precio.");
		System.out.println("4.-Volver a Menú Principal.\n");
		do {
			System.out.print("\tTeclee opción (1-4)? ");
			op = e.nextInt();
		}while(op<1 || op>4);
		return op;
	}
	static void altas(Libros lib[]) {
		System.out.println("\n\tALTAS\n\t=====\n");
		lib[0] =  new Libros("0-261-10320-2","Sin titulo","John Ronald Reuel Tolkien","Fantástica",21.99);
		lib[1] =  new Libros("84-0133-720-8","El nombre del viento","Patrick Rothfuss","Novela",22.90);
		lib[2] =  new Libros("84-01-42282-5","Fahrenheit 451","Ray Bradbury","Novela",6.00);
		lib[3] =  new Libros("84-01-49136-3","Fundación","Isaac Asimov","Novela",9.95);
		lib[4] =  new Libros("84-01-49654-3","Los límites de la Fundación","Isaac Asimov","Novela",11.95);
		lib[5] =  new Libros("84-08-08925-4","El Símbolo Perdido","Dan Brown","Novela",21.90);
		lib[6] =  new Libros("84-1137-542-X","Analísis estructurado moderno","Edward Fraguez","Ensayo",28.00);
		lib[7] =  new Libros("84-16288-95-3","El honor de dios","Lidio Falcó O`neill","Narrativa",26.00);
		lib[8] =  new Libros("84-204-0494-3","Cuando ya no importe","Juan Carlos Onetti","Novela",16.00);
		lib[9] =  new Libros("84-206-3311-9","El Aleph","Jorge Luís Borges","Relato corto",9.00);
		lib[10] =  new Libros("84-207-2634-6","El sí de las niñas","Leandro Fernández de Moratín","Teatro",6.00);
		lib[11] =  new Libros("84-226-6412-7","Negreros","Alberto Vázquez Figueroa","Novela",9.75);
		lib[12] =  new Libros("84-233-1157-0","El tiempo","Ana María Matute","Novela",6.00);
		lib[13] =  new Libros("84-2334-161-0","La reina en el palacio de las corrientes de aire","Stieg larsson","Novela",22.55);
		lib[14] =  new Libros("84-239-9486-4","Ficciones","Jorge Luís Borges","Relato corto",6.50);
		lib[15] =  new Libros("84-246-8013-5","Bollos preñados","Karlos Arguiñano","Ensayo",9.95);
		lib[16] =  new Libros("84-310-3074-0","Tokio Blues","Haruki Murakami","Novela",21.50);
		lib[17] =  new Libros("84-339-2158-3","El antropólogo inocente","Nigel Barley","Ensayo",18.00);
		lib[18] =  new Libros("84-350-3467-4","La muerte en Venecia","Thomas Mann","Novela",12.00);
		lib[19] =  new Libros("84-376-0092-8","La vida es sueño","Pedro Calderón De la Barca","Teatro",6.90);	
	}
	static void visualizacion(Libros lib[]) {
		System.out.println("\t\t\tLISTADO\n\t\t\t=======\n");
		for (int i = 0; i<20;i++) 			
			System.out.println(lib[i].getISBN()+"\t\t"+lib[i].getTitulo()+"\t\t"+lib[i].getAutor()+"\t\t"+lib[i].getGenero()+"\t\t"+lib[i].getPrecio());
	}
	static void ordenarTitulo(Libros lib[]){
		int i1=0,i2=0;
		Libros aux= new Libros();
		System.out.println("\n\t ORDENACIÓN POR TÍTULO\n\t========");
		System.out.println("\n\t Ordenando por título.......\n\n");
		for(i1=0;i1<19;i1++) {
			for(i2=i1+1;i2<20;i2++) {
				if(lib[i1].getTitulo().compareToIgnoreCase(lib[i2].getTitulo())>0) {
					aux=lib[i1];
					lib[i1]=lib[i2];
					lib[i2]=aux;
				}
			}
		}
		System.out.println("Ordenado por título. ");
	}
	static void ordenarAutor(Libros lib[]){
		int i1=0,i2=0;
		Libros aux= new Libros();
		System.out.println("\n\t ORDENACIÓN POR AUTOR\n\t========");
		System.out.println("\n\t Ordenando por autor.......\n\n");
		for(i1=0;i1<19;i1++) {
			for(i2=i1+1;i2<20;i2++) {
				if(lib[i1].getAutor().compareToIgnoreCase(lib[i2].getAutor())>0) {
					aux=lib[i1];
					lib[i1]=lib[i2];
					lib[i2]=aux;
				}
			}
		}
		System.out.println("Ordenado por autor. ");
	}
	static void ordenarPrecio(Libros lib[]){
		int i1=0,i2=0;
		Libros aux= new Libros();
		System.out.println("\n\t ORDENACIÓN POR PRECIO\n\t========");
		System.out.println("\n\t Ordenando por precio.......\n\n");
		for(i1=0;i1<19;i1++) {
			for(i2=i1+1;i2<20;i2++) {
				if(lib[i1].getPrecio()>(lib[i2].getPrecio())) {
					aux=lib[i1];
					lib[i1]=lib[i2];
					lib[i2]=aux;
				}
			}
		}
		System.out.println("Ordenado por precio. ");
	}
	static void fin() {
		System.out.println("Fin del programa \n\n");
	}
	public static void main(String[]args) {	
		Scanner e= new Scanner(System.in);
		Libros lib[]=new Libros[20];
		int op=0,o=0;
		do {			
			op =menu(e);
			switch (op) {
			case 1:
				altas(lib);	
				break;
			case 2:
				visualizacion(lib);
				break;
			case 3:
				do {
					o=menuOrdenar(e);
					switch(o){
					case 1:
						ordenarTitulo(lib);
						break;
					case 2:
						ordenarAutor(lib);
						break;
					case 3:
						ordenarPrecio(lib);
						break;					
					}
				}while(o!=4);
				break;
			default:
				fin();
			}
		}while(op!=4);
		e.close();
	}
}