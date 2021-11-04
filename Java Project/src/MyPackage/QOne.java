package MyPackage;

import java.util.Arrays;

public class QOne {
	
	//public static void main(String[] args) {
	//	
	//}
		
	public static int[] myArray (int[] arr) {
				 
		//int co = 0;
			
		while (!inOrder(arr)) {
			//co += 1;
			//System.out.println(co);
				
				
			for (int i = 0; i < arr.length - 1; ++i) {
				int a;
				if (arr[i] > arr[i + 1]) {
					a = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = a;
						
				}
			}
				
		}
			
		System.out.println("Q1: " + Arrays.toString(arr));
		return arr;
	}
			
	
	
	
	
	static boolean inOrder(int[] myArr) {
		for (int i = 0; i < myArr.length - 1; ++i) {
			if (myArr[i] > myArr[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
