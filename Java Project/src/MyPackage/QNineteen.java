package MyPackage;

import java.util.ArrayList;

public class QNineteen {
	
	public static void tenList () {
	
		ArrayList<Integer> ten = new ArrayList<Integer>();
	
		for (int i = 1; i <= 10; ++i) {
			ten.add(i);
		}
		System.out.println("Q19:");
		System.out.println("Arraylist of 1-10: " + ten);
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for (int i = 0; i < 10; ++i) {
			if (ten.get(i) % 2 == 0) {
				sumEven += ten.get(i);
			}
		}
		
		for (int i = 0; i < 10; ++i) {
			if (ten.get(i) % 2 != 0) {
				sumOdd += ten.get(i);
			}
		}
		
		System.out.println("Sum of all evens: " + sumEven);
		System.out.println("Sum of all odds: " + sumOdd);
		
		ten.remove(0);
		ten.remove(0);
		ten.remove(0);
		ten.remove(1);
		ten.remove(2);
		
		System.out.println("Without primes: " + ten);
		
	}

}
