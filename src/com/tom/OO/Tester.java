package com.tom.OO;

public class Tester {

	public static void main(String[] args) {
		Student stu = new Student("Wang",46,83,76);
//		stu.Chinese = 46;
//		stu.english = 83;
//		stu.math 	= 76;
		stu.print();
		int avg = stu.getAverage();
		System.out.println(stu.name+":"+avg);
	}

}
