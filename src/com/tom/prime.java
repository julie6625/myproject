package com.tom;

public class prime {

	public static void main(String[] args) {
		long n = 100000000000001L;
		boolean prime = true;
		for (long i=2; i<n; i++){
			
			if (n % i == 0){
				
				prime = false;
				break;
			}
		}
		if(prime){
			System.out.println( n +" IS PRIME NUMBER!");
		}
		else{
			System.out.println( n +" IS  NOT PRIME NUMBER!");
		}
	}	
}
