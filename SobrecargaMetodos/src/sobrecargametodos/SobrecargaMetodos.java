package sobrecargametodos;
public class SobrecargaMetodos{
	static int suma(int a,int b) {
		return a+b;
	}
	static int suma(int a,int b, int c) {
		return a+b;
	}
	static String suma(String a, String b) {
		return a+b;
	}
	public static void main(String[]args) {
		int n1=3,n2=4,n3=5;
		System.out.println("Suma de dos números = "+suma(n1,n2));
		System.out.println("Suma de tres números = "+suma(n1,n2,n3));
		System.out.println("Suma de dos cadenas = "+suma("col y ","flor"));
	}
}