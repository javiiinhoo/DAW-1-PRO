package finalllyy;
public class Finally{
	public static void main(String []args) {
		String cad1="20",cad2="10",mensaje = "";
		int numerador,denominador,cociente;
		int[] vNumero= new int[10];
		try {
			vNumero[5]=20;
			numerador=Integer.parseInt(cad1);
			denominador=Integer.parseInt(cad2);
			cociente=numerador/denominador;
			mensaje=String.valueOf(cociente);
		}catch(NumberFormatException nfe) {
			mensaje="Caracteres no numéricos";
		}catch(ArithmeticException ae) {
			mensaje="División por cero";
		}catch(ArrayIndexOutOfBoundsException aioobe) {
			mensaje="Fuera de rango en el array";		
		}finally {
			System.out.println("Se ejecuta siempre");
		}
		System.out.println(mensaje);
	}
}
