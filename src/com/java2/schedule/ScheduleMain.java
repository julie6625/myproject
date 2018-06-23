package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScheduleMain {
	public static void main(String args[]) {
		Schedule m = new Schedule();
		FileInputStream fis;
		try {
			fis = new FileInputStream("Schedule.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while(line!=null) {
				String[] token = line.split(",");
				try {
					String room = token[0];
					String course = token[1];
					int day = Integer.parseInt(token[2]);
					int time = Integer.parseInt(token[3]);
					int dur = Integer.parseInt(token[4]);
					m.courses.add(new Course(room,course,day,time,dur));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				line = in.readLine();
			}
			m.on();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}