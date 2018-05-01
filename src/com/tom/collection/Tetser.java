package com.tom.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tetser {

	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(1);
		System.out.println(set);
		
		Set<String> set2 = new HashSet<>();
		set2.add("Hank");
		set2.add("Tom");
		set2.add("Dank");
		set2.add("Tiger");
		set2.add("Hank");
		System.out.println(set2);
		
		Map<String, Integer> stocks = new TreeMap<>();
		stocks.put("Ack", 1500);
		stocks.put("Back",507 );
		stocks.put("cack",989);
		System.out.println(stocks);
	}

}
