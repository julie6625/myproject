package com.tom;
/*import java.awt.Color;*/
import java.util.Scanner;
public class PrimeNumber2 {

	public static void main(String[] args) {
		/*Color x = new Color( 23, 32, 13 );
		PrimeNumber.setColor (x); //Sets the color of the font*/
		Scanner scanner = new Scanner(System.in);
		long s = scanner.nextLong();
		for(int n = 2; n<=s; n++){
		boolean prime = true;
			for(int i = 2; i<n; i++){
				
				if(n % i == 0){
					
					prime = false;
					break;
				}
			}
			
			if(prime){
				System.out.println(n+"\t"+"remaining from "+(s-n));
			}
		}

	}

	/*private static void setColor(Color x) {
		// TODO Auto-generated method stub
		
	}
	*/
}
