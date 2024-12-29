package com.file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//File Handling : Reading a File------------------- 
public class Program4 {

	public static void main(String[] args) throws Throwable {
		File f = new File(".//sample.txt");
		if (!f.exists())
			f.createNewFile();

		BufferedReader bf = new BufferedReader(new FileReader(f));
		String text = new String();

		while ((text = bf.readLine()) != null)
			System.out.println(text);

		bf.close();
	}

}
