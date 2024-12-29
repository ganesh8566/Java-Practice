package com.file_handling;

import java.io.File;
import java.util.Scanner;
//File Handling : Reading a File------------------- 

public class Program2 {

	public static void main(String[] args) throws Throwable {
		File f = new File("./sample.txt");
		if (!f.exists())
			f.createNewFile();

		Scanner sc = new Scanner(f);
		String text = new String();

		while (sc.hasNext()) {
			text += sc.nextLine() + "\n";
		}
		System.out.println(text);

		sc.close();
	}

}
