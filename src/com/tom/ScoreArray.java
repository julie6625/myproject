package com.tom;

public class ScoreArray {

	public static void main(String[] args) {
		int score[][] = {{77,88,99},{11,22,33},{44,55,66},{33,44,55},{55,66,77}};
		for (int i = 0; i<5; i++){
			System.out.print(score[i][0]+" "+score[i][1]+" "+score[i][2]+" ");
		
		int Array = (score[i][0]+score[i][1]+score[i][2])/3;
			if(Array < 60){
				System.out.println(Array+"*");
			}else{
				System.out.println(Array+" ");
			}
		}
	}

}
