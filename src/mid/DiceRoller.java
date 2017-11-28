package mid;

import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		Random r = new Random();
		for(int i = 1; i<6;i++) {
			for (int n1 = r.nextInt(6)+1,n2 = r.nextInt(6)+1,n3 = r.nextInt(6)+1;;) {
				
				System.out.println(n1+" "+n2+" "+n3);
				
			}
		
		}	
	}

}
