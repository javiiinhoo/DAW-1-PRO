package foranidadas;
public class ForAnidadas{
	public static void main(String[] args) {
		int v,a,b=0;
		/*for(v=0;v<6;++v) 
			System.out.println("Valor de v => " +v);
		System.out.println("Valor de salida de v => " +v);
	*/
	/*for anidadas*/
		for(v=0;v<3;v++) 
			for(a=3;a<7;a++) 
				for(b=2;b<5;b++) 
					System.out.println("v => " +v+"\ta => "+a+"\tb =>" +b);
	}
}