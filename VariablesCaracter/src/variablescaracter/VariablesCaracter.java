package variablescaracter;
import java.io.IOException;
public class VariablesCaracter{
	public static void main(String []args) {
		char caracter=' '; //si no ponemos espacio da error
		//int caracter=0;
		do {
			try {
				System.out.print("Teclea caracter?");
				caracter=(char) System.in.read(); // el (char) es un conversor a car�cter 
			//	caracter=Character.toLowerCase((char) System.in.read());TECLEADO A MIN�SCULAS AS� AHORRAMOS EL PASARLO EN LA COMPARACI�N
				while(System.in.read()!='\n');
			}catch(IOException ioe) {}
		}while(Character.toLowerCase(caracter)!= 's' && Character.toLowerCase(caracter)!= 'n'); 
		//}while((caracter)!='s' && (caracter)!='n');
		//si compar�semos en may�sculas pondr�amos 's' y 'n' en may�sculas//
		System.out.println("\nEl caracter es =>"+caracter);
		if(caracter=='s')
			System.out.println("Acierto");
		else
			System.out.println("Fallo");
	}
}
/*character 
 * toLowerCase (caracter) lo pasa a min�sculas PERO NO LO GUARDA POR SI SOLO SALVO QUE SE INDIQUE*/
/* toUpperCase (caracter) lo pasa a may�sculas PERO NO LO GUARDA POR SI SOLO SALVO QUE SE INDIQUE*/