package MyPackage;

import java.util.Arrays;

public class QTwo {
	
	public static void Fibonacci () {
	
		int[] fibArray = new int[25];
		
		//int x = 1;
		
		for (int i = 0; i < 25; ++i) {
			if (i == 0) {
				fibArray[i] = 0;
			} else if (i == 1){
				fibArray[i] = 1;
			} else {
				fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
			}
		}
		
		System.out.println("Q2: " + Arrays.toString(fibArray));
	
	}
}