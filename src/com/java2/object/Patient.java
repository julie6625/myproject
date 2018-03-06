package com.java2.object;
import java.util.Scanner;
public class Patient {
	public static String Patientname;
	private static int carelevel;
	
	Patient(String s,int n){
		Patientname = s;
		carelevel = n;
	}
//	Scanner sc1 = new Scanner(System.in);
//	String a = sc1.nextLine();
//	
//	public int Calling(String a){
//		
//		System.out.println(Patientname);
//		return carelevel;
//	}
	
	
	public static void main(String[] args) {
		Patient Ian = new Patient("Ian",88);
		Patient Ann = new Patient("Ann",56);
		Patient Dan = new Patient("Dan",30);
		Scanner sc1 = new Scanner(System.in);
		String a = sc1.nextLine();
		if (a=="Ian"){
			System.out.println(carelevel);
		}else if (a=="Ann"){
			System.out.println(carelevel);
		}else if (a=="Dan"){
			System.out.println(carelevel);
		}
	
	}

}
