package vector18nums;
import java.util.Scanner;
public class Vector18Nums2{
	public static void main(String[] args) {
		int v[]=new int[18], nb=0, i=0, j=0;
		Scanner e=new Scanner(System.in);
		boolean duplicado=false;
		for(i=0;i<18;i++){
			do {
				duplicado=false;
				System.out.print("Introduzca un número: ");
				v[i]=e.nextInt();
				for(j=0;j<i && !duplicado;j++){
					if (v[i]==v[j]) {
						duplicado=true;
					}
				}
			}while(duplicado);
				duplicado=false;
				for(i=0;i<18;++i)
					System.out.print(v[i]+"\t");
						System.out.println();	
						System.out.print("\n"+"Teclea valor de nb?");
						nb=e.nextInt();
						for(i=0;i<18 && !duplicado;i++)
							if(nb==v[i])
								duplicado=true;
						if(duplicado)
							System.out.println("El número SI existe.");
						else
							System.out.println("El número NO existe.");
						e.close();

			}
		}
	}
