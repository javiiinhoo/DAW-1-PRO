package vector30nums;
import java.util.Scanner;
public class Vector30Nums {
	public static void main(String[]args) {
		int vector[]=new int[30];
		int i=0, j=0, k=0, aux=0;
		Scanner sc=new Scanner (System.in);

		for (i=0; i<30; i++) {
			System.out.print("Introduzca el elemento "+(i+1)+" del vector ");
			vector[i]=sc.nextInt();
			for(j=0;j<i;j++) {
				for(k=j+1;k<i+1;k++) {
					if (vector[j]>vector[k]) {
						aux=vector[j];
						vector[j]=vector[k];
						vector[k]=aux;
					}
				}
			}
		}
		System.out.println("\n");
		for(i=0;i<30;i++) {
			System.out.print(vector[i]+"\t");
		}
	}

}