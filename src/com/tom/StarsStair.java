package com.tom;
import java.util.Scanner;
public class StarsStair {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String code = scanner.nextLine();
		int h = Integer.parseInt(code);//Âà¼Æ¦r
		for(int n = 1; n<=h; n++){
				for(int i = 1; i<=n;i++){
					System.out.print("*");
				}
				if(n<h){
					System.out.println();
				}
		}

	}

}
