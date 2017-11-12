package com.tom;
import java.util.Scanner;
public class StarMattress {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int s = sc1.nextInt();
		for(int i = 1; i<=s; i++) {
			for(int n = 1; n<=i; n++) {
				System.out.print("*");
			}
			for(int m = s-1; m>=i; m--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}

}
