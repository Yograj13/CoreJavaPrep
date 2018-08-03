package com.yograj.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("temp.txt");
		System.out.println(file.exists());
		try {
			file.createNewFile();
			System.out.println(file.exists());
			
			file.delete();
			System.out.println(file.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
