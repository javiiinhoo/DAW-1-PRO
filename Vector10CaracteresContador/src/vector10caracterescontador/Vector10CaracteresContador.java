package vector10caracterescontador;

import java.io.IOException;

public class Vector10CaracteresContador{
	public static void main(String[]args){
		char vcar[]=new char[10];
		//char vcar[]={'a','b','c','d','e','f'};
		int i=0,conta=0,conte=0,conti=0,conto=0,contu=0,cc=0;
		for (i=0;i<10;i++) {
			try {
				System.out.print("Teclea caracter?");
				vcar[i]=(char)Character.toUpperCase((char) System.in.read());
				while(System.in.read()!='\n');
			}catch(IOException ioe) {}
		}
		for (i=0;i<10;i++) 
			System.out.print(vcar[i]+"\t");
		System.out.println("");
		for (i=0;i<10;i++) {
			if(vcar[i]=='A') 
				conta+=1;
			else
				if(vcar[i]=='E') 
					conte+=1;
				else
					if(vcar[i]=='I') 
						conti+=1;
					else
						if(vcar[i]=='O') 
							conto+=1;
						else
							if(vcar[i]=='U') 
								contu+=1;
							else
								cc+=1;
		}
		System.out.println("Número de a:"+conta);
		System.out.println("Número de e:"+conte);
		System.out.println("Número de i:"+conti);
		System.out.println("Número de o:"+conto);
		System.out.println("Número de u:"+contu);
		System.out.println("Número de consonantes:"+cc);



	}

}
