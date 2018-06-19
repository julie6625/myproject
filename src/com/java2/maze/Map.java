package com.java2.maze;

import java.util.*;

public class Map {
	public Map(int row, int col, int trapCount) {
		
	}
	class map {
		int row,col,traps;
		int[] trappos;
		Player player = new Player(100,0);
		
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
		
	}
}
