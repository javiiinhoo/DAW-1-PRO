package metodos;
public class Metodos{
	static void metodo1_1(){
		System.out.println("Dentro de método 1_1");
	}
	static void metodo1(){
		System.out.println("Dentro de método 1");
		System.out.println("Llamada a método 1");
		metodo1_1();
	};
	static void metodo2(){
		System.out.println("Dentro de método 2");
	};
	static void metodo3(){
		System.out.println("Dentro de método 3");
		System.out.println("Llamada a método 1 desde método 3");
		metodo1();
	};
public static void main(String[]args) {
	
	System.out.println("Llamada a método 1");
	metodo1();
	System.out.println("Retorno de método 1");
	System.out.println("Llamada a método 2");
	metodo2();
	System.out.println("Retorno de método 2");
	System.out.println("Llamada a método 3");
	metodo3();
	System.out.println("Retorno de método 3");

}
}