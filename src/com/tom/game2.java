package com.tom;
import java.util.Scanner;
public class game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("請輸入方向:");
			int code = scanner.nextInt();
			
			switch (code){
				case 8:
					System.out.println("向上");
					break;
				case 6:
					System.out.println("向右");
					break;
				case 4:
					System.out.println("向左");
					break;
				case 2:
					System.out.println("向下");
					break;
//				default:
//					System.out.println("wrong number");
//					break;
				
			}
			if(code == 0){
				System.out.println("Bye");
				break;
			}else if(code != 4&&code != 6&&code != 8&&code != 2){
				System.out.println("wrong number");
			}
		}	
	}

}
