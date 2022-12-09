package vector18nums;
import java.util.Scanner;
public class Vector18Nums {
	public static void main(String[] args) {
		int v[]=new int[18],num=0, nb=0, i=0, j=0;
		Scanner e=new Scanner(System.in);     
		for(i=0;i<18;i++){
			boolean duplicado=false;

			System.out.print("Introduzca un número: ");
			num=e.nextInt();
			for(j=0;j<i &&!duplicado;j++){
				if (num==v[j]) {
					duplicado=true;
					System.out.print("El número "+num+" ya está guardado en la matriz");
				}
			}if(duplicado==false){
				v[i]=num;
			}else{
				i=i-1;
				System.out.print(", introduzca un número distinto a los anteriores:\n");
			}

		}

		for(i=0;i<18;i++){
			System.out.print(v[i]+"\t");
		}	  

		System.out.print("\n"+"Teclea valor de nb?");
		boolean encontrado=false;
		nb=e.nextInt();
		for(i=0;i<18;i++){
			if(nb==v[j])
				encontrado=true;
		}
		if (encontrado=false)

			System.out.print("Número encontrado en el vector");
		else

			System.out.print("Número no encontrado en el vector");
		e.close();
	}

}