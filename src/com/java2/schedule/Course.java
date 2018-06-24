package com.java2.schedule;

public class Course {
	String room;
	String course;
	int day;
	int time;
	int dur;


	public Course(String room, String course, int day, int time, int dur) {
		this.room = room;
		this.course = course;
		this.day = day;
		this.time = time;
		this.dur = dur;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getRoom() {
		return room;
	}
	public void setcourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay() {
		return day;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getTime() {
		return time;
	}
	public void setDur(int dur) {
		this.dur = dur;
	}
	public int getDur() {
		return dur;
}

}
