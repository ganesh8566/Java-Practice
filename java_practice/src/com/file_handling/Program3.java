package com.file_handling;

import java.io.File;
import java.io.FileReader;

//File Handling : Reading a File------------------- 
public class Program3 {

	public static void main(String[] args) throws Throwable {
		File f = new File("./sample.txt");
		if (!f.exists())
			f.createNewFile();

		FileReader fr = new FileReader(f);
		int asciiCode;
		while ((asciiCode = fr.read()) != -1) {
			System.out.print((char)asciiCode);
		}
		
		fr.close();
	}

}
