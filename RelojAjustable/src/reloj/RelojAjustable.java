package reloj;
import java.util.Scanner;
public class RelojAjustable{
	public static void main(String[] args) {
		Scanner e =  new Scanner(System.in);
		int h,m,s,hi,mi=0;
		//long r=0; /*long usa 8byte*/
		System.out.print ("Hora?");
		hi = e.nextInt();
	    System.out.print ("Minutos?");
	    mi = e.nextInt();

		for(h=hi;h<24;h++) {
			for(m=mi;m<60;m++) { 
				for(s=0;s<60;s++) { 
					System.out.println(h+":"+m+":"+s );
					//for (r=0;r<999999999;r++); retardador, depende de la vel CPU
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e1) {} // sleep para pararlo 1000ms
	}
			}
		}
	}
}