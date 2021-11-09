package MyPackage;

//import java.util.*;

//import java.util.Scanner;

public class QThirteen {
	
	public static void marioStairs (int a) {
		
		/*
		int a = 0;
		Scanner in = new Scanner(System.in);
		
		//while (true) {
		try {
			
			System.out.println("Type in an integer");
			a = in.nextInt();
			//in.close();
			//break;
		} catch (Exception e) {
			System.out.println("You have to type in an integer!");
		} finally {
			//in.close();
		}
		//}
		
		//in.close();
		 */
		
		boolean b = true;
		
		System.out.println("Q13:");
			
		for (int i = 0; i < a; ++i) {
			if (i == 0) {
				System.out.print(0);
				b = false;
			}
			
			else {
				System.out.println();
				for (int j = 0; j <= i; ++j) {
					if (b == true) {
						System.out.print(0 + " ");
						b = false;
					}
					else {
						System.out.print(1 + " ");
						b = true;
					}
				}	
			}
		}
		
		
	}
}