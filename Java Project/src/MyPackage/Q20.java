package MyPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Arrays;


public class Q20 {
	
	public static void reader() {
		
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"src/MyPackage/Data.txt"));
			String line = reader.readLine();
			while (line != null) {
				String[] strLine = line.split(":");
				
				String fName = strLine[0];
				String lName = strLine[1];
				String age = strLine[2];
				String state = strLine[3];
				System.out.println("Name: " + fName + " " + lName);
				System.out.println("Age: " + age + " years");
				System.out.println("State: " + state + " State");
				System.out.println();
				//System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		/*
		try {
		      File myObj = new File("Data.txt");
		      Scanner myFile = new Scanner(myObj);
		      while (myFile.hasNextLine()) {
		        String data = myFile.nextLine();
		        System.out.println(data);
		      }
		      //myFile.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		*/
	}
	
}



//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;