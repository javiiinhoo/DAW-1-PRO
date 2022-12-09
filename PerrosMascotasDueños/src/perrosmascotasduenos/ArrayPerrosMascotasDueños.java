package perrosmascotasduenos;
import java.util.Scanner;
public class ArrayPerrosMascotasDueños{
	static int menu(Scanner e) {
		int op = 0;
		System.out.println("\n\tMENÚ PRINCIPAL\n\t====");
		System.out.println("1.Altas personas.");
		System.out.println("2.Altas mascotas.");
		System.out.println("3.Visualizar personas.");
		System.out.println("4.Visualizar mascotas.");
		System.out.println("5.Crear dueños.");
		System.out.println("6.Visualizar dueños.");
		System.out.println("7.Ordenar por nombres.");
		System.out.println("8.Fin.");
		do {
			System.out.print("\n\tTeclee opción(1-8): ");
			op = e.nextInt();
		} while (op < 1 || op > 8);
		return op;	
	}
	static int altasPerros(Perros perro()){}
}