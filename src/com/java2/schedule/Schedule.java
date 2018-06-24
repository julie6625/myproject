package com.java2.schedule;

import java.util.*;

public class Schedule {
	List<Course> courses = new ArrayList<>();
	
	public void on() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入星期(1~7)：");
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
		
		
		
		
		if(isavaliable) {
			System.out.println("【有空檔】");
		}else {
			System.out.println("【有課：   "+room+" "+course+" 到"+(time+dur)+"時】");
		}
	}
}
