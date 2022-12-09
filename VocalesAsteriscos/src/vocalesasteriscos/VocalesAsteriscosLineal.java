package vocalesasteriscos;
import java.util.Scanner;
public class VocalesAsteriscosLineal{

	public static void main(String[]args) {
		char caracter=' ';
		Scanner e=new Scanner(System.in);
		int pos;
		String frase1="";
		String frase2="";	

		System.out.println("Teclea frase");
		frase1=e.nextLine();
		for(pos=0;pos<frase1.length();pos++) {
			caracter=Character.toLowerCase(frase1.charAt(pos));

			switch(caracter) {
			case 'Α','a','A','α','Ι','e','E','ι','i','I','ν','Ν','o','O','σ','Σ','u','U','ϊ','Ϊ','ά','ό':
				caracter='*';
			}
			frase2+=caracter;
		}
		System.out.println("\nFrase modificada "+frase2);
		System.out.println("Segunda forma");
		frase2="";
		String vocales= "aeiouαινσϊό";
		char vocal[]=vocales.toCharArray();
		int i=0;
		System.out.println("Teclea frase");
		frase1= e.nextLine();
		for(pos=0;pos<frase1.length();pos++) {
			caracter= Character.toLowerCase(frase1.charAt(pos));
			for(i=0;i<vocal.length;i++)
				if(vocal [i]==caracter)
					caracter='*';

			frase2+=caracter;
		}
		System.out.println("\nFrase modificada "+frase2);
		System.out.println("Tercera forma");
		char frase[];	
		System.out.println("Teclear frase?");
		frase1=e.nextLine();
		frase=frase1.toCharArray();
		for(pos=0;pos<frase.length;pos++)
			for(i=0;i<vocal.length;i++)
				if(Character.toLowerCase(frase[pos])==vocal[i])
					frase[pos]='*';


		frase1= String.valueOf(frase);
		System.out.println("\nFrase modificada "+frase1);
		e.close();
	}

}