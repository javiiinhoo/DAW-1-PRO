package tablerobordes;
public class TableroBordes{
	public static void main (String[]args){
		int m[][]= {{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9}};
		int ifi=0,ico=0;
		for (ifi=0;ifi<8;ifi++) {
			for (ico=0;ico<8;ico++) {
				System.out.print(m[ifi][ico]+"\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		for (ifi=0;ifi<8;ifi++) {
			for (ico=0;ico<8;ico++){
				if((ifi==0)||(ico==7)||(ico==0)||(ifi==7))
					m[ifi][ico]=1;
					else
					m[ifi][ico]=0;
			}
		}	
		
		for (ifi=0;ifi<8;ifi++) {
			for (ico=0;ico<8;ico++) {
				System.out.print(m[ifi][ico]+"\t");
			}
			System.out.print("\n");
			}
		}	
}