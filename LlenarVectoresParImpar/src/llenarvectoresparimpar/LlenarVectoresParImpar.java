package llenarvectoresparimpar;
import java.util.Scanner;
public class LlenarVectoresParImpar{
	public static void main(String[]args) {
		Scanner e = new Scanner(System.in);
		int v1[]= new int[6],v2[]= new int[6];
		int i1=0,num=0;
		for(i1=0;i1<6;i1=i1+2) {
			System.out.println("Teclea numero¿?");
			num=e.nextInt();
			v1[i1]=num;
			if(i1+1<6) { //es que no te quedas fuera si i+1 es menor que 6
				v2[i1+1]=num;
				if(i1==4) //en la primera pasada cuando llegue a 4 no quiero que vuelva a empezar, 
					i1=-1; //se pone a -1 proque cuando llegue a menos 1 le suma 2 y queda en impares, entra "por la derecha"
			}
		}
		v2[0]=num;
		System.out.println("V1\tV2\n------------\n");
		for(i1=0;i1<6;i1++) 
			System.out.println(v1[i1]+"\t"+v2[i1]);		
		e.close();
	}
}