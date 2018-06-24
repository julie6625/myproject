package com.java2.schedule;

import java.util.*;

public class Schedule {
	List<Course> courses = new ArrayList<>();
	
	public void on() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the day(1~7):");
		int input = scanner.nextInt();
		int tmp = 0;
		int time = 0;
		int dur = 0;
		String course = null;
		String room = null;
		boolean isavaliable = true;
		
		for(int i=0;i<courses.size();i++) {
			Course c = courses.get(i);
			if(input==c.getDay()) {
				tmp = c.getDay();
				time = c.getTime();
				dur = c.getDur();
				room = c.getRoom();
				course = c.getCourse();
				break;
			}
		}
		

		System.out.println("enter the time (0~24):");
		
		input = scanner.nextInt();
		if(input>=time && input<=(time+dur)) {
			isavaliable = false;
		}
		
		
		
		
		if(isavaliable) {
			System.out.println("is avalible");
		}else {
			System.out.println("there's a class in "+room+" of "+course+" to "+(time+dur));
		}
	}
}
