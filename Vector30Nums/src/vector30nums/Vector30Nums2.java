package vector30nums;
import java.util.Scanner;
public class Vector30Nums2 {
	public static void main(String[]args) {
		Scanner e = new Scanner(System.in);
		int n[]= {0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0};
		int i1=0, i2=0, num=0, cn=0;
		do {
			System.out.print("Teclea "+(++cn)+"º número? ");
			num=e.nextInt();
			i1=0;
			while(num>n[i1]&&n[i1]!=0)
				i1++;
			if(n[i1]!=0) {
				for(i2=29;i2<i1;i2--)
					n[i2]=n[i2-1];
			}
			n[i1]=num;
			System.out.println("\n");

		}while(n[29]==0 &&cn<30);
		System.out.println("\n");
		for(i1=0;i1<30;i1++)
			System.out.print(n[i1]+"\t");
		e.close();
	}
}