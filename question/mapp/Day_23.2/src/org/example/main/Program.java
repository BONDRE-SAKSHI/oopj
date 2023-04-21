package org.example.main;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
	public static void main(String[] args) {
		try {
			String pathName = "/Users/sandeep/Desktop/CDAC/";
			File file = new File(pathName);
			if( file.exists() && file.isDirectory()) {
				//String[] nameList = file.list();
				File[] files = file.listFiles();
				for (File f : files) {
					if( !f.isHidden())
						System.out.println(f.getName());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main6(String[] args) {
		try {
			//String pathName = "D:\\Users\\sandeep\\CDAC\\Quiz.txt";	//Windows
			String pathName = "/Users/sandeep/Desktop/CDAC/Quiz.txt";	//Linux
			File file = new File(pathName);
			if( file.exists()) {
				System.out.println( "File Name	:	"+file.getName());	//Quiz.txt
				System.out.println("Parent Directory:	"+file.getParent());
				System.out.println("Length		:	"+file.length());
				System.out.println("Last Modified	:	"+new SimpleDateFormat("dd MMM,yyyy hh:mm:ss").format(new Date(file.lastModified())));
			}
			else {
				boolean status = file.createNewFile();
				System.out.println("File creation is successful.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main5(String[] args) {
		try {
			String pathName = "Sample";
			File file = new File(pathName);
			if( !file.exists())
				System.out.println("Directory does not exist.");
			else {
				boolean status = file.delete();
				System.out.println("Directory deletion is successful.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main4(String[] args) {
		try {
			String pathName = "Sample";
			File file = new File(pathName);
			if( file.exists())
				System.out.println("Directory already exist.");
			else {
				boolean status = file.mkdir();
				System.out.println("Directory creation is successful.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main3(String[] args) {
		try {
			String pathName = "Sample.txt";
			File file = new File(pathName);
			if( !file.exists())
				System.out.println("File does not exist.");
			else {
				boolean status = file.delete();
				System.out.println("File deletion is successful.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		try {
			String pathName = "Sample.txt";
			File file = new File(pathName);
			if( file.exists())
				System.out.println("File already exist.");
			else {
				boolean status = file.createNewFile();
				System.out.println("File creation is successful.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		String pathName = "Sample.txt";
		File file = new File(pathName);
	}
}
