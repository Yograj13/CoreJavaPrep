package com.yograj.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("the([^\\s])*");//find occurences starting with the
		Matcher matcher;// = pattern.matcher("sdabraboooab");
		File file = new File("temp.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		//new BufferedReader(new FileReader(new File("temp.txt"))).readLine();
		
		String s;
		int lineNo=1;
		while((s=br.readLine())!=null) {
			matcher=pattern.matcher(s);
			while(matcher.find()) {
				System.out.println("LineNo::"+lineNo+" :: "+matcher.group());
			}
			lineNo++;
			//System.out.println("\n");
		}
		
		
		
	}

}
