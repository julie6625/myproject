package com.java2.object;

import java.util.Scanner;

public class PatientInformation {
	public static void main(String[] args) {
		Patient Ian = new Patient("Ian",88);
		Patient Ann = new Patient("Ann",56);
		Patient Dan = new Patient("Dan",30);
		Scanner sc1 = new Scanner(System.in);
		while(true) {
			String a = sc1.nextLine();
			switch(a) {
				case "Ian":
					System.out.println("88");
					break;
				case "Ann":
					System.out.println("56");
					break;
				case "Dan":
					System.out.println("30");
					break;
			}
		}
	
	}
	
		
	

}
