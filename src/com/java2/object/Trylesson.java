package com.java2.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Trylesson {

	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(66);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
