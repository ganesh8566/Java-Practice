package com.file_handling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File f = new File("./hello.docx");
		System.out.println(f.createNewFile());
//		System.out.println(f.delete());
//		if(f.exists())
//			f.delete();
//		System.out.println(f.createNewFile());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getCanonicalPath());
		System.out.println(Arrays.toString(f.list()));
		System.out.println(Arrays.toString(f.listFiles()));
		System.out.println(f.getAbsolutePath());
		System.out.println(f.canExecute());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
		System.out.println(f.isAbsolute());
		System.out.println(f.isFile());
		System.out.println(f.isHidden());
		System.out.println(f.equals(f));
	}


}
