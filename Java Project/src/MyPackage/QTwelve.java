package MyPackage;

//import java.util.ArrayList;
//import java.util.Arrays;

public class QTwelve {
	
	public static void enhanced () {
		//ArrayList<Integer> even = new ArrayList<Integer>();
		
		int[] numArr = new int[100];
		
		for (int i = 1; i <= 100; ++i) {
			numArr[i - 1] = i;
		}
		//System.out.println(Arrays.toString(numArr));
		
		System.out.println("Q12:");
		
		for (int number : numArr) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}

}
