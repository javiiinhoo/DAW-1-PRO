package personasmascotasduenos;
import java.util.Scanner;
public class PersonasMascotasDuenhos{
	static int menu(Scanner e, int tm) {	
		int op = 0;
		switch(tm) {
		case 0:
			System.out.println("\n\tMENÚ PRINCIPAL\n\t==========");
			System.out.println("1.Altas personas.");
			System.out.println("2.Altas mascotas.");
			System.out.println("3.Visualizar personas.");
			System.out.println("4.Visualizar mascotas.");
			System.out.println("5.Crear dueños.");
			System.out.println("6.Visualizar dueños.");
			System.out.println("7.Ordenar por nombres.");
			System.out.println("8.Fin.");
			do {
				System.out.print("\n\tTeclee opción(1-8): ");
				op = e.nextInt();
			} while (op < 1 || op > 8);
			break;
		case 1: 
			op=0;//opción de ordenado
			System.out.println("\n\tORDENADO POR: \n\t==================\n");
			System.out.println("1.Nombre del dueño.");
			System.out.println("2.Nombre de la mascota.");
			System.out.println("3.Volver al menú principal.");
			do {
				System.out.print("\n\tTeclee opción(1-3): ");
				op = e.nextInt();
			} while (op < 1 || op > 3);
			break;
		}
		return op;	
	}
	static void altasPersonas(Scanner e,Personas p[]) {
		System.out.println("ALTAS PERSONAS....");
		p[0] = new Personas("11111111P","Luis");
		p[1] = new Personas("22222222J","Sara");
		p[2] = new Personas("33333333L","María");
		p[3] = new Personas("44444444K","Carlota");
		p[4] = new Personas("12345678S","Fernando");
		p[5] = new Personas("98877665H","Clara");
		p[6] = new Personas("32211665C","Lara");
		p[7] = new Personas("23443211D","Alberto");
		p[8] = new Personas("11222211T","Ceferino");
		p[9] = new Personas("12344432R","Paula");
	}
	static void altasMascotas(Scanner e,Mascotas m[]) {
		System.out.println("ALTAS MASCOTAS....");
		m[0] = new Mascotas("44444444K","Kira",5); 
		m[1] = new Mascotas("11111111P","Suca",3); 
		m[2] = new Mascotas("12344432R","Lia",7); 
		m[3] = new Mascotas("33333333L","Thor",11); 
		m[4] = new Mascotas("12345678S","Lukas",44); 
		m[5] = new Mascotas("11222211T","Sheldon",1); 
		m[6] = new Mascotas("12344432R","Pepa",4); 
		m[7] = new Mascotas("32211665C","Sugus",8); 
		m[8] = new Mascotas("44444444K","Lio",7); 
		m[9] = new Mascotas("11222211T","Joker",14); 
		m[10] = new Mascotas("11222211T","Tormenta",10); 
		m[11] = new Mascotas("23443211D","Luna",9); 
		m[12] = new Mascotas("22222222J","Pipo",2); 
		m[13] = new Mascotas("98877665H","Coco",2); 
		m[14] = new Mascotas("44444444K","Xiro",3);
	}
	static void visualizarPersonas(Personas p[]) {
		try {
			System.out.println("\t\tLISTADO\n\t\t=======\n");
			for (int i = 0; i<10;i++) 
				System.out.println(p[i].getDNI()+"\t "+p[i].getNombre()+"\t\t");
		}catch(NullPointerException npe) {
			System.out.println("Hay que llenar antes el array.");
		}
	}
	static void visualizarMascotas(Mascotas m[]) {
		try {
			System.out.println("\t\tLISTADO\n\t\t=======\n");
			for (int i=0; i<10;i++) 
				System.out.println(m[i].getDNI()+"\t "+m[i].getMascota()+"\t"+m[i].getEdad()+"\t\t");
		}catch(NullPointerException npe) {
			System.out.println("Hay que llenar antes el array.");
		}
	}
	static void crearDuenhos(Duenhos d[],Personas p[], Mascotas m[]){
		int k=0; // porque no quiero cambiar de mascota sino de dueño aunque tengan una length idéntica.
		for (int i=0;i<10;i++) {
			for (int j=0;j<15;j++) {
				if((p[i].getDNI()==m[j].getDNI()))
					d[k++]=new Duenhos(p[i].getDNI(),p[i].getNombre(),m[j].getMascota(),m[j].getEdad());
			}
		}
		System.out.println("Dueños creados...");
	}
	static void visualizarDuenhos(Duenhos d[]) {		
		try {
			System.out.println("\tLISTADO DE DUEÑOS\n===============\n");
			for (int i=0;i<15;i++) 
				System.out.println(d[i].getDNI()+"\t "+d[i].getNombre()+"\t"+d[i].getMascota()+"\t"+d[i].getEdad()+"\t\t");
		}catch(NullPointerException npe) {
			System.out.println("Hay que llenar antes el array.");
		}
	}
	static void ordenar(Duenhos d[],int op) {
		int i1=0,i2=0;
		Duenhos aux= new Duenhos();
		if (op==0) {
			System.out.println("ORDENANDO POR DUEÑOS....");
			for(i1=0;i1<14;i1++)
				for (i2=i1+1; i2<15;i2++) {
					if(d[i1].getNombre().compareToIgnoreCase(d[i2].getNombre())>0) {
						aux = d[i1];
						d[i1] = d[i2];
						d[i2] = aux;	
					}
				}
		}
		if (op==1) {
			System.out.println("ORDENANDO POR MASCOTAS....");
			for(i1=0;i1<15;i1++)
				for (i2=i1+1; i2<15;i2++) {
					if(d[i1].getMascota().compareToIgnoreCase(d[i2].getMascota())>0) {
						aux = d[i1];
						d[i1] = d[i2];
						d[i2] = aux;		
					}
				}
		}
	}
	static void fin() {
		System.out.println("FIN DEL PROGRAMA\n================\n\n");
	}
	public static void main(String []args) {
		Scanner e = new Scanner(System.in);
		Mascotas m[]=new Mascotas[15];
		Personas p[]=new Personas[10];
		Duenhos d[]=new Duenhos[15];
		int opcion = 0,orden = 0;
		do {
			opcion = menu(e,0);
			switch(opcion) {
			case 1:
				altasPersonas(e,p);
				break;
			case 2:
				altasMascotas(e,m);
				break;
			case 3:
				visualizarPersonas(p);
				break;
			case 4:
				visualizarMascotas(m);
				break;
			case 5:
				crearDuenhos(d,p,m);
				break;
			case 6:
				visualizarDuenhos(d);
				break;
			case 7:
				do {
					orden = menu(e,1);
					switch(orden) {
					case 1: 
						ordenar(d,0);
						break;
					case 2:
						ordenar(d,1);
						break;
					case 3:
						ordenar(d,2);
						break;
					}
				}while(orden!=3);
			default:
				fin();
			}
		}while(opcion != 8);
		e.close();
	}
}	