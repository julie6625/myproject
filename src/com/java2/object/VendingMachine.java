package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class VendingMachine {
	List<Drink> drinks = new ArrayList<>();
	
	public VendingMachine(){
		
	}
	
	public void addDrink(int id, String name, int price) {
		drinks.add(new Drink(id, name, price));
	}

	public void on() {
		
		int coin = 0;
		System.out.println("insert the coin,or enter 0 to the next step");
		for (int i = 0; i < drinks.size(); i++) {
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());

		}
		
		boolean s1 = true;
		boolean s2 = false;
		while(s1){
			Scanner sc1 = new Scanner(System.in);
			int coinin = sc1.nextInt();
			switch(coinin){
			case 0:
				System.out.println("going to the next step");
				s1=false;
				s2=true;
				break;
			case 5:
				coin = coin + 5;
				System.out.println("coin:"+coin);
				break;
			case 10:
				coin = coin + 10;
				System.out.println("coin:"+coin);
				break;
			case 50:
				coin = coin + 50;
				System.out.println("coin:"+coin);
				break;
			default:
				System.out.println("wrong data,try again.");
				break;
				
			}
		}
		while(s2) {
			System.out.println("please enter the drinkID ,enter 0 to quit");
			Scanner sc2 = new Scanner(System.in);
			int drinkID = sc2.nextInt();
			switch(drinkID) {
			default :
				System.out.println("wrong data,try again");
			case 0:
				System.out.println("change :"+coin);
				System.out.println("bye bye~");
				s2 = false;
				break;
			case 1:
				if(coin<25) {
					System.out.println("not enought money..");
					
				}else {
					coin = coin - 25;
					System.out.println("(Coke drops)");
					System.out.println("money:"+coin);
				}
				break;
			case 2:
				if(coin<30) {
					System.out.println("not enought money..");
					
				}else {
					coin = coin - 30;
					System.out.println("(Orange Juice drops)");
					System.out.println("money:"+coin);
				}
				break;
			case 3:
				if(coin<20) {
					System.out.println("not enought money..");
				}else {
					coin = coin - 20;
					System.out.println("(Sprite drops)");
					System.out.println("money:"+coin);
				}
				break;
			}
		}
	}	
}
