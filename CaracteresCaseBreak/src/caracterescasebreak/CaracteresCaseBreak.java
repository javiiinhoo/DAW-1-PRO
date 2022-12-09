package caracterescasebreak;
import java.io.IOException;
public class CaracteresCaseBreak{
	public static void main(String[]args){
		char vcar[]=new char[10];
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
		for(i=0;i<10;i++) {
			switch (vcar[i]) {
			case 'A':
				conta+=1;
				break;
			case 'E':
				conte+=1;
				break;
			case 'I':
				conti+=1;
				break;
			case 'O':
				conto+=1;
				break;
			case 'U':
				contu+=1;
				break;
			}
			
			if(vcar[i]!='A'&&vcar[i]!='E'&&vcar[i]!='I'&&vcar[i]!='O'&&vcar[i]!='U')
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