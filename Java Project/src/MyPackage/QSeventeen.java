package MyPackage;

import java.util.Scanner;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class QSeventeen {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void interest () {
		
		float P = 0;
		float rate = 0;
		int t = 0;
		
		System.out.println("Q17: ");
		
		
		while (true) {
		try {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Type in the principal amount");
			P = in.nextFloat();
			System.out.println("Type in the rate");
			rate = in.nextFloat();
			System.out.println("Type in the number of years");
			t = in.nextInt();
			//in.close();
			
			float si = P * (1 + ((rate / 100) * t));
			
			df.setRoundingMode(RoundingMode.UP);
			System.out.println("SI: " + df.format(si));
			//in.close();
			break;
			} catch (Exception e) {
				//e.getMessage();
				System.out.println("You have to type in a double for principal, double for rate and integer for time!" + e.getMessage());
			}
			//finally {
			//	in.close();
			//}
		}
		
		//in.close();
		
	}

}
