package com.tom;

public class WithoutThree {

	public static void main(String[] args) {
//		for(int i = 1; i<=13;i++){
//			if(i % 3 == 0){
//				continue;
//			}
//			System.out.print(i+" ");
//		}
		int a = 0;
		while(a<=13){
			a++;
			if(a % 3 == 0){
				continue;
			}
			System.out.print(a +" ");
			
			continue;
			
		}
	}

}
