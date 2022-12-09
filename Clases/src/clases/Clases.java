package clases;
import java.util.Scanner;
public class Clases{
	public static void main(String[]args) {
		Scanner e=new Scanner (System.in);
		String nombre=null;
		int edad=0;
		Persona p1=new Persona();
		p1= new Persona("Pedro",15);
		System.out.println("Nombre=> "+p1.getNombre());
		System.out.println("Edad=> "+p1.getEdad());
		
		//Se puede poner así si no ponemos a los atributos privados
		//y quitando las lineas 6 y 7
//		System.out.println("Nombre.....: "+p1.nombre);
//		System.out.println("Edad.......: "+p1.edad);
		
		Persona p2= new Persona();
		p2=new Persona("Clara",27);
		System.out.println("Nombre=> "+p2.getNombre());
		System.out.println("Edad=> "+p2.getEdad());
		
		p1= new Persona("Carlos",33);
		System.out.println("Nombre=> "+p1.getNombre());
		System.out.println("Edad=> "+p1.getEdad());
		
		
		
		System.out.println("Nombre?: ");
		nombre=e.nextLine();
		System.out.println("Edad?: ");
		edad=e.nextInt();
		e.nextLine();
		p1=new Persona(nombre,edad);
		System.out.println("Nombre=> "+p1.getNombre());
		System.out.println("Edad=> "+p1.getEdad());
	
		
		System.out.println("Edad?: ");
		edad=e.nextInt();
		p1.setEdad(edad);
		System.out.println("Nombre=> "+p1.getNombre());
		System.out.println("Edad=> "+p1.getEdad());
		
		p1.VisualizarObjeto();
		p2.VisualizarObjeto();
		
		p2=p1;
		p2.VisualizarObjeto();
		p1.VisualizarObjeto();
		
		p1.setNombre(p2.getNombre());
		p1.setEdad(p2.getEdad());
		
		p2.VisualizarObjeto();
		p1.VisualizarObjeto();
		e.close();
	}
}

	
	