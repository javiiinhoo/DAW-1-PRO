package vector10caracteres;

import java.io.IOException;

public class Vector10Caracteres{
	public static void main(String[]args){
		char vcar[]=new char[10];
		//char vcar[]={'a','b','c','d','e','f'};
		int i=0;
		for (i=0;i<10;i++) {
			try {
				System.out.print("Teclea caracter?");
				vcar[i]=(char) System.in.read();
				while(System.in.read()!='\n');
			}catch(IOException ioe) {}
		}
		for (i=0;i<10;i++) 
			System.out.print(vcar[i]+"\t");
	}
}