package com.tom;
import java.util.*;
public class GameTester {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int hp = 100;
		int pos = 0;
		int row = 3;
		int col = 5;
		System.out.println("目前位置:0   初始血量:100");
		while(true){
			
			System.out.print("請輸入要走的方向:");
			int code = sc1.nextInt();
			switch (code){
				case 2:
					if(pos/col<row-1){
						pos = pos+col;
					}else{
						System.out.println("hp-30");
						hp = hp-30;
					}
					System.out.println("目前位置:"+pos+" "+"目前血量"+hp);
					break;
				case 4:
					if(pos%col!=0){
						pos = pos-1;
					}else{
						System.out.println("hp-30");
						hp = hp-30;
					}
					System.out.println("目前位置:"+pos+" "+"目前血量"+hp);
					break;
					
				case 8:
					if(pos/col>0){
						pos = pos-col;
					}else{
						System.out.println("hp-30");
						hp = hp-30;
					}
					System.out.println("目前位置:"+pos+" "+"目前血量"+hp);
					break;
					
				case 6:
					if(pos%col!=col-1){
						pos = pos+1;
					}else{
						System.out.println("hp-30");
						hp = hp-30;
					}
					System.out.println("目前位置:"+pos+" "+"目前血量"+hp);
					break;
					
			}
			/*if(pos/col>row-1||pos/col<0){
				System.out.println("cant go");
				break;
			}
			else if(pos%col==0){
//				if(code==4){
//					System.out.println("cant go");
//					break;
//				}
//			}else if(pos%col==col-1){
//				if(code==6){
//					System.out.println("cant go");
//					break;
//				}
//			}*/
		}

	}

}
