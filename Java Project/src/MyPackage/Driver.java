package MyPackage;

//import java.util.Arrays;

public class Driver {
	
	public static void main (String[] args) {
		//Q1
		//QOne qone = new QOne();
		int[] anArray = new int[] {1,0,5,6,3,2,3,7,9,8,4};
		
		QOne.myArray(anArray);
		
		//Q2
		QTwo.Fibonacci();
		
		//Q3
		QThree qthree = new QThree();
		
		qthree.reverseString("Hello");
		
		//Q4
		QFour qfour = new QFour();
		qfour.Factorial(6);
		
	}
}	