package com.medi.phl.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {

	public static void doReadFile(String path)throws Exception
	{
		File f = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String line = "";
		
		while((line = br.readLine())!= null)
		{
			System.out.println(line);
		}
		
		
		
	}
	public static void main(String[] args) {
		try {
			ReadFile.doReadFile("D:\\Ashish\\Java Case Study\\CaseStudy.txt");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
