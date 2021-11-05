package MyPackage;

import java.util.ArrayList;

//import java.util.Arrays;

public class QNine {
	
	public static void Prime () {
		
		int[] numArray = new int[100];
		ArrayList<Integer> isPrime = new ArrayList<Integer>();
		
		//System.out.println("Q9:");
		
		for (int i = 1; i <= 100; ++i) {
			numArray[i - 1] = i;
			if (i == 1 ||i == 2 || i == 3) {
				//System.out.println(i);
				isPrime.add(i);
			} else {
				int a = i / 2;
				//System.out.println("a: " + a);
				int c = 0;
				for (int j = 2; j <= a; ++j) {
					if (i % j == 0 && c == 0) {
						//System.out.println("j if statement");
						c = 1;
						//System.out.println(i);
					} 
				}
				if (c == 0) {
					//System.out.println(i);
					isPrime.add(i);
				}
			}
		}
		
		System.out.println("Q9: " + isPrime);
		
	}

}
