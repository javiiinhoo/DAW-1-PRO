package rombo;
public class Rombo{
	public static void main (String []args) {
		char es = ' ';
		char aster = '*';
		for (int i= 1;i<=3;i++){
			for (int esp=4-i;esp>0;esp--)      
				System.out.print(es);
			for (int l=1; l<2*i; l++)
				System.out.print(aster);
			System.out.println("");
		}
		for (int i=4; i>=1; i--){
			for (int esp=4-i;esp>0;esp--)      
				System.out.print(es);
			for (int l=1;l<2*i;l++)
				System.out.print(aster);
			System.out.println("");
		}
	}
}