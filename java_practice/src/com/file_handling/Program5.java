package com.file_handling;

import java.io.File;
import java.io.FileOutputStream;

//File Handling : Writing a File------------------- 
public class Program5 {

	public static void main(String[] args) throws Throwable {
		File f = new File("./sample1.txt");
		if (f.exists())
			f.delete();
		f.createNewFile();

		String text = "Hello Ganesh";
		char[] c = text.toCharArray();
		FileOutputStream fo = new FileOutputStream(f);

		for (int i = 0; i < c.length; i++) {
			fo.write((int)c[i]);
		}
		fo.flush();
		fo.close();
	}

}
