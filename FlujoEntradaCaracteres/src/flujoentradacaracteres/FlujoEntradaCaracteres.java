package flujoentradacaracteres;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FlujoEntradaCaracteres{
	public static void main (String[]args) {
		int car=0;
		String texto=null;
		try {
			//Si ya existe el fichero, FileWriter lo abre y escribe en �l, sino lo crea
			FileWriter esc=new FileWriter("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programaci�n\\textos\\texto.txt",true);
			//FileWriter esc=new FileWriter("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programaci�n\\textos\\texto.txt",false);, desaparece lo que haya escrito anteriormente.
			//ruta="C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programaci�n\\textos\\"
			//ruta+texto.txt
			//nombreFich="texto.txt"
			//ruta+nombreFich
			//distintas formas
			//si no existe el fichero, la clase FileWriter lo crea, el true tal y como est� a�ade texto, si estuviera en false no(por omisi�n tiene false.)
			System.out.println("Teclear texto a grabar: ");
			car=(char) System.in.read(); //grabando car�cter a car�cter.

			while(car!='*') {
				esc.write(car);
				car=(char) System.in.read();
			}
			//Siempre hay que cerrar los ficheros
			esc.close();
		}catch(IOException ioe) { //ioe:inputoutput exception
			System.out.println(ioe.getMessage()); 
		}
		//Para que acabe la grabaci�n de texto hay que poner * al final
		System.out.println("Fin de proceso de escritura.");
		texto="";
		try {
			FileReader in =new FileReader("C:\\Users\\DA-1.PUESTO222\\Desktop\\ejercicios programaci�n\\textos\\texto.txt");
			car= in.read();
			while(car!=-1) { //si no logra leer nada, devuelve el m-1, mientras no sea -1 es que est� leyendo
				texto+=(char)car;
				System.out.println((char)car);
				car=in.read();
			}
			System.out.println("El texto le�do caracter a caracter es....: "+texto);
			in.close();
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
}