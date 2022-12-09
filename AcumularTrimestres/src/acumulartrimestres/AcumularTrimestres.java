package acumulartrimestres;

import java.util.Scanner;

public class AcumularTrimestres {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int impm[] = new int[12], imptri[] = new int[4], im = 0, it = 0;

		for (im = 0; im < 12; im = im + 1) {
			System.out.println("Teclea el importe del " + (im + 1) + "º mes:");
			impm[im] = e.nextInt();
		}

		for (im = 0; im < 12; im = im + 1) {
			if (im != 0 && im % 3 == 0) {
				it = it + 1;
			}
			imptri[it] = imptri[it] + impm[im];
		}
		for (it = 0; it < 4; it = it + 1) {
			System.out.println("El importe por trimestres es: " + imptri[it]);
			e.close();
		}
	} 
}
				
	