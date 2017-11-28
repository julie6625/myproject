import java.util.*;
public class Dice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入1~365之間的一個數字：");
		String input = scan.nextLine();
		int n[] ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day = Integer.parseInt(input);
		if (day>365 || day<1){
			System.out.println("資料輸入錯誤！");
		}
		else{
		int j = 1;
		//Type 2
/*		int n[] = new int[3];
		n[0] = 2;
		n[1] = 4;
		n[2] = 5;
		//For-Each 語法
		for(int i : n){
		}
*/
		for(int i=0;i<n.length;i++){
			day = day -n[i];
			if(day<=0){
				System.out.println("是"+ j +"月"+ (n[j-1] + day)+ "日");
				break;
			}
			else{
				j++;
			}
		}
/*
		for(int i=0;i<=n.length;i++){
			if(day<=n[i]){
				System.out.println((i+1)+ "/" + day);
				break;
			}
			else{
				day=day - n[i];
			}
		}
*/
		}

	}

}
