package com.java2.object;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.java2.object.Drink;

public class VendingMain {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		FileInputStream fr;
		try {
			fr = new FileInputStream("vending.txt");
			InputStreamReader isr = new InputStreamReader(fr);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			String[] tokens = line.split(",");
			int count = Integer.parseInt(tokens[0]);
			
			for (int i = 0; i < count; i++){
				String name = tokens[i*2+1];
				int price = Integer.parseInt(tokens[i*2+2]);
				vm.drinks.add(new Drink(i+1, name, price));
			}
			vm.on();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}