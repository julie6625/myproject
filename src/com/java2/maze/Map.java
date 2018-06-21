package com.java2.maze;

import java.util.*;

public class Map {
//traps setup,gaming hasn't done yet

	int row,col,traps;
	Player player = new Player(100,0);
	int health = player.gethealth();
	int pos = player.getpos();


	boolean gaming = true;
	Random r1 = new Random();
	HashSet<Integer> trap = new HashSet<>();
	List<Integer> token = new ArrayList<>();


	public Map(int row, int col, int traps) {
		super();
		this.row = row;
		this.col = col;
		this.traps = traps;
	}

	public class Player{
		public Player(int health, int pos) {
			super();
			this.health = health;
			this.pos = pos;
		}
		int health = 100;
		int pos = 0;

		public int gethealth() {
			return health;

		}


		public void sethealth(int health) {
			this.health = health;
		}

		public int getpos() {
			return pos;
		}

		public void setpos(int pos) {
			this.pos = pos;
	}

	}
	public void putTrap() {
		for (int i = 0; i < traps; i++) {
			trap.add(r1.nextInt(16));
		}
		while (trap.size() != traps) {
			trap.add(r1.nextInt(16));
		}

		Iterator<Integer> it = trap.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			token.add(i);
}
	}
	public void start() {
		while(gaming) {
			Scanner sc1 = new Scanner(System.in);
			int i = sc1.nextInt();
			switch (i) {
			case 8:
				if ((pos / col) > 0) {
					pos = pos - 4;
				} else {
					health = health - 5;
					System.out.println("you hit a wall");
				}
				System.out.println("pos:"+pos + " hp:" + health);
				break;
			case 2:
				if ((pos / col) < 3) {
					pos = pos + 4;
				} else {
					health = health - 5;
					System.out.println("you hit a wall");
				}
				System.out.println("pos:"+pos + " hp:" + health);
				break;
			case 4:
				if ((pos % col) > 0) {
					pos = pos - 1;
				} else {
					health = health - 5;
					System.out.println("you hit a wall");
				}
				System.out.println("pos:"+pos + " hp:" + health);
				break;
			case 6:
				if ((pos % col) < 3) {
					pos = pos + 1;
				} else {
					health = health - 5;
					System.out.println("you hit a wall");
				}
				System.out.println("pos:"+pos + " hp:" + health);
				break;
			case 5:
				System.out.println("nothing happened");
				break;

			}
			if (pos == token.get(0) || pos == token.get(1) || pos == token.get(2)
					|| pos == token.get(3) || pos == token.get(4)) {
				health = health - 5;
				System.out.println("ouch! the traps!");
			}
			if (i == 0 || health <= 0) {
				System.out.println("GG");
				gaming = false;
}
		}

	}
}
