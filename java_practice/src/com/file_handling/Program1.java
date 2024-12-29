package com.file_handling;

import java.io.File;
import java.io.FileInputStream;

// File Handling : Reading a File------------------- 
public class Program1 {

	public static void main(String[] args) throws Throwable {
		File file = new File("./sample.txt");
		if (!file.exists())
			file.createNewFile();

		FileInputStream fi = new FileInputStream(file);
		int asciiCode;
		while ((asciiCode = fi.read()) != -1) {
			System.out.print((char) asciiCode);
		}

		fi.close();
	}

}
