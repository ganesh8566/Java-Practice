package com.file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Program7 {

	public static void main(String[] args) throws Throwable{
		File f = new File("./sample1.txt");
		
		if(f.exists())
			f.delete();
		f.createNewFile();
		
		String text = "Hello Every One\nwelcome to warangal";
		BufferedWriter bf = new BufferedWriter(new FileWriter(f));
		
		for(char s : text.toCharArray()) {
			bf.write((int)s);
		}
		bf.flush();
		bf.close();
	}

}
