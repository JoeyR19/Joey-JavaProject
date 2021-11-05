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
		
		//Q5
		QFive qfive = new QFive();
		qfive.Index("Veterinarian", 10);
		
		//Q6:
		QSix qsix = new QSix();
		qsix.evenOrOdd(10);
		
		//Q7:
		QSeven.Sort();
		
		//Q8
		//QEight qeight = new QEight();
		QEight.Palindrome();
		
		//Q9
		QNine.Prime();
		
		//Q10
		QTen qten = new QTen();
		qten.Compare(19, 12);
	}
}	