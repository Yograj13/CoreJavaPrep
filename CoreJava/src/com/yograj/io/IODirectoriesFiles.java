package com.yograj.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class IODirectoriesFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File babaDir = new File("baba");
		babaDir.mkdirs();
		
		File aaiDir = new File(babaDir,"aai");
		aaiDir.mkdirs();
		
		File aaiDirRename = new File(babaDir,"Aai");
		aaiDir.renameTo(aaiDirRename);
		
		System.out.println(aaiDirRename.isDirectory());
		
		//aaiDirRename.delete();
		
		//System.out.println(aaiDirRename.isDirectory());
		
		File familyFile = new File(babaDir,"familyfile.docx");
		
		try {
			PrintWriter pw = new PrintWriter(familyFile);
			
			pw.println("I've family with 6 memeber");
			pw.println("including me.");
			pw.print("temp");
			pw.append('J');
			pw.flush();
			pw.close();
			
			FileReader fr = new FileReader(familyFile);
			
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
			br.close();
			
			File search = new File(babaDir, "familyfile");
			
			String [] files= new String[100];
			files=search.list();
			
			for(String fn : files)
				System.out.println("found==>"+fn);
			
		} catch (IOException | NullPointerException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
	}

}
