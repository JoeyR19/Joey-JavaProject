package MyPackage;

import java.text.SimpleDateFormat;

import java.lang.Math;

import java.util.Arrays;

//import java.time.LocalDate;

import java.util.Date;

public class QFourteen {
	
	public static void caseSwitch () {
		
		System.out.println("Q14:");
		
		
		String command = "square root";
		switch (command) {
		
		case "square root":
			
			System.out.println("Square root of " + 16 + " is " + Math.sqrt(16));
			break;
			
		case "date":
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
			//LocalDate date = LocalDate.now();
			Date date = new Date();
			String str = formatter.format(date);
		    System.out.println("Today's Date: "+str);
		    
		
		case "java":
			String[] strs = new String[5];
			String stra = "I am learning Core Java";
			String[] arrOfStr = stra.split(" ");
			for (int i = 0; i < arrOfStr.length; ++i) {
				strs[i] = arrOfStr[i];
			}
			System.out.println(Arrays.toString(arrOfStr));
				
			
		}
		
		String commandb = "date";
		switch (commandb) {
		
		case "square root":
			
			System.out.println("Square root: " + Math.sqrt(16));
			
		case "date":
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
			//LocalDate date = LocalDate.now();
			Date date = new Date();
			String str = formatter.format(date);
		    System.out.println("Today's Date: "+str);
		
		case "java":
			String[] strs = new String[5];
			String stra = "I am learning Core Java";
			String[] arrOfStr = stra.split(" ");
			for (int i = 0; i < arrOfStr.length; ++i) {
				strs[i] = arrOfStr[i];
			
			}
			System.out.println(Arrays.toString(arrOfStr));
		}
		
		String commandc = "java";
		switch (commandc) {
		
		case "square root":
			
			System.out.println("Square root: " + Math.sqrt(16));
			
		case "date":
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
			//LocalDate date = LocalDate.now();
			Date date = new Date();
			String str = formatter.format(date);
		    System.out.println("Today's Date: "+str);
		
		case "java":
			String[] strs = new String[5];
			String stra = "I am learning Core Java";
			String[] arrOfStr = stra.split(" ");
			for (int i = 0; i < arrOfStr.length; ++i) {
				strs[i] = arrOfStr[i];
			
			}
			System.out.println(Arrays.toString(arrOfStr));
		}
	}
}
