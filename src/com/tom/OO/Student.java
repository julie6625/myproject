package com.tom.OO;

public class Student {
	int Chinese;
	int math;
	int english;
	String name;
	
	public Student(String n,int C,int m,int e){
		name = n;
		Chinese = C;
		math = m;
		english = e;
		
	}
	
	public void print(){
		System.out.println(english+"\t"+
	math+"\t"+Chinese);
	}
	
	public int getAverage() {
		return(Chinese+math+english)/3;
	}
}
