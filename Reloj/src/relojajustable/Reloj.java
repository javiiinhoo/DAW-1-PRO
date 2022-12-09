package relojajustable;
public class Reloj{
	public static void main(String[] args) {
		int h,m,s,hi,mi=0;
		long r=0; /*long usa 8byte*/
		for(h=0;h<24;h++) {
			for(m=0;m<60;m++) { 
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