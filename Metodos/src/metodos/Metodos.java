package metodos;
public class Metodos{
	static void metodo1_1(){
		System.out.println("Dentro de m�todo 1_1");
	}
	static void metodo1(){
		System.out.println("Dentro de m�todo 1");
		System.out.println("Llamada a m�todo 1");
		metodo1_1();
	};
	static void metodo2(){
		System.out.println("Dentro de m�todo 2");
	};
	static void metodo3(){
		System.out.println("Dentro de m�todo 3");
		System.out.println("Llamada a m�todo 1 desde m�todo 3");
		metodo1();
	};
public static void main(String[]args) {
	
	System.out.println("Llamada a m�todo 1");
	metodo1();
	System.out.println("Retorno de m�todo 1");
	System.out.println("Llamada a m�todo 2");
	metodo2();
	System.out.println("Retorno de m�todo 2");
	System.out.println("Llamada a m�todo 3");
	metodo3();
	System.out.println("Retorno de m�todo 3");

}
}