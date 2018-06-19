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
		
	}
	public void start() {
		while(gaming) {
			
		}
		
	}
}
