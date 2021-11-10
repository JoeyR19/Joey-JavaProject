package MyPackage;

import java.util.ArrayList;

public class QNineteen {
	
	private static boolean prime(int num) {
		for (int i = 2; i < num; ++i) {
			if (num % i == 0) {
				//System.out.println("is not prime");
				return false;
			}
		}
		//System.out.println("is prime");
		return true;
	}
	
	public static void tenList () {
		
		//prime(9);
	
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
		
		for (int i = 1; i < ten.size(); ++i) {
			//System.out.println(ten.get(i));
			if (prime(ten.get(i))) {
				ten.remove(i);
				//if (i != 0) {
					i--;
					//System.out.println("i: " + i);
				//}
			}
		}
		
		
		/*
		ten.remove(0);
		ten.remove(0);
		ten.remove(0);
		ten.remove(1);
		ten.remove(2);
		*/
		System.out.println("Without primes: " + ten);
		
	}

}
