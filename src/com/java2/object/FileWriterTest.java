package com.java2.object;

import java.io.FileNotFoundException;

import java.io.PrintStream;

public class FileWriterTest {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = new PrintStream("data.txt");
		out.println("Tom\t1\t1000");
		out.flush();
		out.close();
	}

}
