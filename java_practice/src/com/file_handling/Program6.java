package com.file_handling;

import java.io.File;
import java.io.FileWriter;

public class Program6 {

	public static void main(String[] args) throws Throwable {
		File f = new File("./sample1.txt");

		if (f.exists())
			f.delete();
		f.createNewFile();

		FileWriter fw = new FileWriter(f);
		String text = "Hello Every One welcome to warangal";
		char[] c = text.toCharArray();

		for (int i = 0; i < c.length; i++) {
			fw.write((int) c[i]);
		}
		fw.flush();
		fw.close();
	}

}
