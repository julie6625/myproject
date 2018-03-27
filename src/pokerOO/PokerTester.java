package pokerOO;

import java.util.*;

public class PokerTester {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		cards.add(12);
		cards.add(8);
		cards.add(3);
		cards.set(1,99);
		System.out.println("removing numeber:"+cards.remove(0));
		System.out.println(cards.size());
		System.out.println(cards.get(1));
//		String flowers = "SHDC";
//		Poker poker = new Poker();
//		poker.shuffle();
//		poker.show();
		
	}

}
