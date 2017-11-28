package com.tom;
import java.util.*;
public class ScoreTester {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		while(true){
			int score = sc1.nextInt();
			System.out.println(score/10);
			int level = (score/10);
			switch(level){
			
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Failed");
				break;
			case 6:
				System.out.println("Passed");
				break;
			case 7:
				System.out.println("good");
				break;
			case 8:
				System.out.println("Great");
				break;
			case 9:
			case 10:
				System.out.println("Excellent");
				break;
	
			}
		}	
	}

}
