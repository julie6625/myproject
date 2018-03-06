package com.java2.object;

public class Patient {
	public String Patientname;
	private int carelevel;
	
	Patient(String s,int n){
		Patientname = s;
		carelevel = n;
	}
	
	public String calling(int carelevel){
		return Patientname;
	}

}
