package clasealumno;
import java.util.Scanner;
public class EjercicioClases{
	public static void main(String[]args) {
		int numero=0;
		Scanner e= new Scanner(System.in);
		String nombre =null;
		double nota1=0,nota2=0, nota3=0;
		Alumno alumno1= new Alumno();
		Alumno alumno2= new Alumno();
		System.out.println("Número.........:");
		numero =e.nextInt();
		e.nextLine();
		System.out.println("Nombre");
		nombre=e.nextLine();
		e.nextLine();
		System.out.println("Primera nota");
		nota1=e.nextDouble();
		e.nextLine();
		System.out.println("Segunda nota");
		nota2=e.nextDouble();
		e.nextLine();
		System.out.println("Tercera nota");
		nota3=e.nextDouble();
		System.out.println("\n\n");
		alumno1= new Alumno(numero,nombre,nota1,nota2,nota3);
		System.out.println("Media del alumno 1:......\t"+((nota1+nota2+nota3)/3));
		alumno1.visualizarAlumno();
		e.close();
		alumno2= new Alumno(numero,nombre,nota1,nota2,nota3);
		System.out.println("Media del alumno 2:......\t"+((nota1+nota2+nota3)/3));
		alumno2.visualizarAlumno();
		e.close();

	}

}