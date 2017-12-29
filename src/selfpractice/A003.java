package selfpractice;

import java.util.Scanner;

public class A003 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int m,d,S;
		while(sc1.hasNext()) {
			m=sc1.nextInt();
			d=sc1.nextInt();
			S=(m*2+d)%3;
			if(S == 0) {
				System.out.println("´¶³q");
			}
			if(S == 1) {
				System.out.println("¦N");
			}
			if(S == 2) {
				System.out.println("¤j¦N");
			}
		}
	}


}
