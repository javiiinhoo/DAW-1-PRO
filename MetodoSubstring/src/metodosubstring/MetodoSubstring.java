package metodosubstring;

public class MetodoSubstring{

	public static void main(String[]args) {
		String cadena ="cadena 12 prueba";
		String numeroC=cadena.substring(2,5);
		//String numeroC=cadena.substring(7,10); // pilla el espacio
		System.out.println("Subcadena= "+numeroC);
		System.out.println(numeroC);
		System.out.println(Integer.parseInt(numeroC)/3); // convertir a entero
		
	}
}