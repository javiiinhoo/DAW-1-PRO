package arrayobjetos;
import java.io.IOException;
import java.util.Scanner;
public class ArrayObjetos{
	@SuppressWarnings("resource")
	public static void main(String[]args) {
		Scanner e= new Scanner(System.in);
		int i=0,edad=0;
		String nombre=null;
		char sexo=' ';
		Persona persona[]= new Persona;
		for(i=0;i<4;i++) {
			persona[i]= new Persona();
			System.out.println("Nombre? ");
			nombre=e.nextLine();
			System.out.println("Edad? ");
			edad=e.nextInt();
			try {
				System.out.println("Sexo? ");
				sexo=(char)System.in.read();
				while(System.in.read()!='\n');
			}catch(IOException ioe) {}
			e.nextLine():
				persona[i]	= new Persona(nombre,edad,sexo);
			//persona[i].setNombre(nombre);
			//persona[i].setEdad(edad);
			//persona[i].setSexo(sexo);

		}
		for(i=0;i<4;i++)
			System.out.println(persona[i].	getNombre(i)+" "+persona[i]);
	}
}