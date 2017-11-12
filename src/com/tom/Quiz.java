package com.tom;
import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		System.out.println("問題: 以下誰最年紀最大?"+"\n"+"1) 周杰倫"+"\n"+"2) 華晨宇"+"\n"+"3) 梁朝偉");
		Scanner sc1 = new Scanner(System.in);
		String a = sc1.nextLine();
		if(a == "3") {
			System.out.println("答對");
		}else {
			System.out.println("錯囉");
		}
		
	}

}
