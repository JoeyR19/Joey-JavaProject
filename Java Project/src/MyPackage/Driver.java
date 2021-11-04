package MyPackage;

import java.util.Arrays;

public class Driver {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,0,5,6,3,2,3,7,9,8,4};
		
		//int[] arr = {1,0,5,6,3,2,3,7,9,8,4};
			 
		int[] b = new int[arr.length];
		
		//int[] c = {};
		//int[] t = {};
		
		//boolean d = false;
		int co = 0;
		
		//for (int w = 0; w < arr.length - 6; ++w) {
		while (!inOrder(arr)) {
			co += 1;
			System.out.println(co);
			for (int n = 0; n < arr.length; ++n) {
				//System.out.println("b[n] is " + b[n]);
				b[n] = arr[n];
			}
			
			for (int i = 0; i < arr.length - 1; ++i) {
				int a;
				if (arr[i] > arr[i + 1]) {
					a = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = a;
					
				}
			}
			//c = arr;
			//System.out.println("c is " + Arrays.toString(c));
			//System.out.println("b is " + Arrays.toString(b));
			
			
			/*
			if (Arrays.equals(b, arr)) {
				d = true;
				//System.out.println("arrays equal");
			}
			*/
		}
		
		System.out.println(Arrays.toString(arr));
		
	    
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