package MyPackage;

//import java.util.*; 

import java.util.Scanner;

public class Adder {
	
	public static void main (String[] args) {
	
		
		while (true) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Type in the first integer");
			int a = in.nextInt();
			System.out.println("Type in the second integer");
			int b = in.nextInt();
			System.out.println(Add(a, b));
			//in.close();
			} catch (Exception e) {
			System.out.println("You have to type in an integer!");
		}
		
		//in.close();
		}
		
	
	}
	
	public static int Add(int o, int t) {
		return (o + t);
	}

}
