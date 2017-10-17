package com.tom;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
		int age = 0;
		float weight = 57.5f;
		char c = 65;
		char c2 = 'A';
		//
		int i = c2;
		System.out.println((int)c2);
		System.out.println(i);
		boolean pass = true;
		System.out.println(pass);
		
		String s = new String("Hello");
		Random r = new Random();
		System.out.println(r.nextInt(6)+1);
	}

}
