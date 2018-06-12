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
		Scanner sc1 = new Scanner(System.in);
		int coinin = sc1.nextInt();
		boolean c1 = true;
		boolean c2 = false;
		int coin = 0;
		for (int i = 0; i < drinks.size(); i++) {
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());

		}
		System.out.println("投幣，或輸入0以結束");
		
		while(c1){
			switch(coinin){
			case 0:
				c1=false;
				c2=true;
				break;
			case 5:
				coin = coin + 50;
				break;
			}
			
		}
	}	
}
