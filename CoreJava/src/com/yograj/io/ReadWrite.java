package com.yograj.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] input = new char[50];
		
		
		File file= new File("temp.txt");
		
		try {
			FileWriter wr = new FileWriter(file);
			wr.write("hello\nhowdy \n ");
			wr.flush();
			wr.close();
			
			FileReader fr = new FileReader(file);
			
			int size=fr.read(input);
			
			for(char c: input) {
				System.out.print(c);
			}
			
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
