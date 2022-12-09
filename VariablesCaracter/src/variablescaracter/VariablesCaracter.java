package variablescaracter;
import java.io.IOException;
public class VariablesCaracter{
	public static void main(String []args) {
		char caracter=' '; //si no ponemos espacio da error
		//int caracter=0;
		do {
			try {
				System.out.print("Teclea caracter?");
				caracter=(char) System.in.read(); // el (char) es un conversor a carácter 
			//	caracter=Character.toLowerCase((char) System.in.read());TECLEADO A MINÚSCULAS ASÍ AHORRAMOS EL PASARLO EN LA COMPARACIÓN
				while(System.in.read()!='\n');
			}catch(IOException ioe) {}
		}while(Character.toLowerCase(caracter)!= 's' && Character.toLowerCase(caracter)!= 'n'); 
		//}while((caracter)!='s' && (caracter)!='n');
		//si comparásemos en mayúsculas pondríamos 's' y 'n' en mayúsculas//
		System.out.println("\nEl caracter es =>"+caracter);
		if(caracter=='s')
			System.out.println("Acierto");
		else
			System.out.println("Fallo");
	}
}
/*character 
 * toLowerCase (caracter) lo pasa a minúsculas PERO NO LO GUARDA POR SI SOLO SALVO QUE SE INDIQUE*/
/* toUpperCase (caracter) lo pasa a mayúsculas PERO NO LO GUARDA POR SI SOLO SALVO QUE SE INDIQUE*/