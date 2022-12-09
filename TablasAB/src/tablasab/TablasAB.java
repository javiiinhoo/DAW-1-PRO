package tablasab;
import java.util.Scanner;
public class TablasAB{	public static void main(String[] args) {
	Scanner e = new Scanner(System.in);
	//	int v1[]= {0,9,5,4};
	int i=0, j=0, intento=0, B=0;
	int v1[] = new int[4];
	int v2[] = new int[4];
	// Llenar v1 con valores dentro del rango
	for(i=0; i<4;i++) {
		do {
			System.out.print("Teclee el elemento v1["+i+"] (rango: 0-9)--> ");
			v1[i]=e.nextInt();
			if(v1[i]<0 || v1[i]>9){
				System.out.println("Valor fuera de rango (0-9)");
				if (i==0){
					do {
						i=0;
						System.out.print("Teclee el elemento v1["+i+"] (rango: 0-9)--> ");
						v1[i]=e.nextInt();
						if(v1[i]<0 || v1[i]>9){
							System.out.println("Valor fuera de rango (0-9)");	
						}
					}while(v1[i]<0 || v1[i]>9);
				}else {
					i--;
				}
			}
		}while(v1[i]<0 && v1[i]>9);		
	}
	System.out.println("\nEl vector v1 ha sido guardado.\n");
	//Comienza el juego
	do{ //Llenar vector v2 con valores dentro del rango
		B=0;
		System.out.println(" ");
		for(i=0; i<4;i++) {
			do {
				System.out.print("Teclee el elemento v2["+i+"] (rango: 0-9)--> ");
				v2[i]=e.nextInt();
				if(v2[i]<0 || v2[i]>9){
					System.out.println("Valor fuera de rango (0-9)");
					if (i==0){
						do {
							i=0;
							System.out.print("Teclee el elemento v2["+i+"] (rango: 0-9)--> ");
							v2[i]=e.nextInt();
							if(v2[i]<0 || v2[i]>9){
								System.out.println("Valor fuera de rango (0-9)");	
							}
						}while(v2[i]<0 || v2[i]>9);
					}else {
						i--;
					}
				}
			}while(v2[i]<0 && v2[i]>9);		
		}
		// Visualizar v2 para poder compararlo con los aciertos
		System.out.println("\n");
		System.out.print("v2 [  ");
		for(i=0; i<4; i++)
			System.out.print(v2[i]+"  ");
		System.out.println("]");
		// Comparar v1 y v2 para mostrar aciertos
		for(i=0; i<4;i++) {
			for(j=0; j<4;j++) {
				if(v1[i]==v2[j]) {
					if(i==j) {
						System.out.println(v2[j]+" -> B");
						B++;
						if(B==4)
							intento=3;
					}
					else
						System.out.println(v2[j]+" -> A");
				}
			}
		}

		intento++;

	}while(intento<3);

	if(B==4)
		System.out.println("\n Partida ganada");
	else
		System.out.println("\n Partida perdida");

	e.close();
}

}