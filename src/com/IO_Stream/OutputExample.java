package com.IO_Stream;

import java.io.FileWriter;

public class OutputExample {

	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("E:\\Output.txt");
			
			fw.write("Hello to the World");
			
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
			
		}
		System.out.println("Success....");

	}

}
