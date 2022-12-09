package codificarfrase;
import java.util.Scanner;
public class CodificarFrase{
	static int menu(Scanner e) {
		System.out.println("\tMENU \n\n ===== \n1.Teclear frase\n2.-Codificar frase\n3.-Decodificar frase\n4.-Visualizar frase\n5.-Fin\n");
		int op=0;
		do {
			System.out.print("\t Teclee opción(1-5)?");
			op=e.nextInt();
		}while(op<1 || op>5);
		e.nextLine(); // si no estuviera aquí haría falta en el method teclear pues no cerrarías tuberia.
		return op;
	}
	static String teclearFrase(Scanner e) {
		String f=null;
		System.out.println("Teclee frase.\n");
		f=e.nextLine();
		return f;
		}
	static String codificarFrase(String f) {
		char letra[];
		int p=0;		
		letra=f.toCharArray();
		for(p=0;p<letra.length;p++)
			switch(letra[p]) {
			case' ':
				letra[p]='*';
				break;
			case',':
				letra[p]='-';
				break;
			case'.':
				letra[p]='+';
				break;
			case'z','Z': 
				letra[p]=(char)(((int)letra[p])-25); //guardo el caracter, lo convierto a número y le resto 25.
			break;
			default:
				letra[p]=(char)(((int)letra[p])+1); //guardo el caracter, lo convierto a número y le sumo 1.
			}
		f=String.valueOf	(letra);
		System.out.println("\n\n\n\t Fin de la codificación...\n");
		return f;
	}
	static String decodificarFrase(String f) {		
		char letra[];
		int p=0;		
		letra=f.toCharArray();
		for(p=0;p<letra.length;p++)
			switch(letra[p]) {
			case' ':
				letra[p]=' ';
				break;
			case'-':
				letra[p]=',';
				break;
			case'+':
				letra[p]='.';
				break;
			case'a','A':
				letra[p]=(char)(((int)letra[p])+25);  //guardo el caracter, lo convierto a número y le sumo 25.
			break;
			default:
				letra[p]=(char)(((int)letra[p])-1); //guardo el caracter, lo convierto a número y le resto 1.
				break;
			}
		f=String.valueOf	(letra);
		System.out.println("\n\n\n\t Fin de la decodificación...\n");
		return f;	
	}

	static String visualizarFrase(String f) {
		System.out.println(f);
		return f;
	}
	static void fin() {
		System.out.println("\n\n Fin del programa.");
		System.exit(0);
	}
	public static void main(String[]args) {
		Scanner e= new Scanner (System.in);
		int opc=0;
		String frase=null;
		do {
			opc=menu(e);
			switch (opc) {
			case(1):
				frase=teclearFrase(e);
			break;
			case(2):
				frase=codificarFrase(frase);
			break;
			case(3):
				frase=decodificarFrase(frase);
			break;
			case(4):
				visualizarFrase(frase);
			break;
			default:
				fin();
			}
		}while(opc!=5);
	}
}