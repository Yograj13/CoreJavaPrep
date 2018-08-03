package com.yograj.generics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerExample {

	public static void main(String[] args) {
		
		String match;
		int lineNo=1;
		
		try {
			Scanner s = new Scanner(new File("temp.txt"));
			
			while(s.hasNextLine()) {
				//string=s.nextLine();
				while((match=s.findInLine("the([^\\s])*"))!=null){
					System.out.println(lineNo+" :: "+match);
				}
				s.nextLine();
				lineNo++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
