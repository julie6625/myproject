package com.tom;

public class PrimeNumber {

	public static void main(String[] args) {
		int r = (int) (Math.random() * 100);
		System.out.println("randomly generate a number first,then find the prime number before it");
		for(int n = 2; n<r; n++){
		boolean prime = true;
			for(int i = 2; i<n; i++){
				
				if(n % i == 0){
					
					prime = false;
					break;
				}
			}
			
			if(prime){
				System.out.println(n);
			}
		}
		System.out.println("prime number before:"+r);

	}

}
