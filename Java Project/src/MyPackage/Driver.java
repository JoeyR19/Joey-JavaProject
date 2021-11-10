package MyPackage;

//import java.util.Scanner;

//import java.util.Arrays;




public class Driver {
	
	public static void main (String[] args) {
		
		//Q1
		//QOne qone = new QOne();
		int[] anArray = new int[] {1,0,5,6,3,2,3,7,9,8,4};
		
		QOne.myArray(anArray);
		System.out.println();
		
		//Q2
		QTwo.Fibonacci();
		System.out.println();
		
		//Q3
		QThree qthree = new QThree();
		
		qthree.reverseString("Hello");
		System.out.println();
		
		//Q4
		QFour qfour = new QFour();
		qfour.Factorial(6);
		System.out.println();
		
		//Q5
		QFive qfive = new QFive();
		qfive.Index("Veterinarian", 10);
		System.out.println();
		
		//Q6:
		QSix qsix = new QSix();
		qsix.evenOrOdd(10);
		
		System.out.println();
		//Q7:
		QSeven.Sort();
		System.out.println();
		
		//Q8
		//QEight qeight = new QEight();
		QEight.Palindrome();
		System.out.println();
		
		//Q9
		QNine.Prime();
		System.out.println();
		
		//Q10
		QTen qten = new QTen();
		qten.Compare(19, 12);
		System.out.println();
		
		//Q11
		QEleven.OtherPac();
		System.out.println();
		
		//Q12
		QTwelve.enhanced();
		System.out.println();
		
		//Q13
		QThirteen.marioStairs(5);
		
		System.out.println();
		System.out.println();
		
		//Q14
		QFourteen.caseSwitch();
		System.out.println();
		
		//Q15
		QFifteen qfift = new QFifteen();
		qfift.Interfaces();
		System.out.println();
		
		//Q16
		//QSixteen.command();
		
		//Q17
		QSeventeen.interest();
		System.out.println();
		
		//Q18
		System.out.println("Q18: ");
		QEighteen qet = new QEighteen();
		qet.anyUpper("any Upper case?");
		qet.anyUpper("any upper case?");
		qet.lowerCase("any Upper case?");
		qet.convertToInt("20");
		System.out.println();
		
		//Q19
		QNineteen.tenList();
		System.out.println();
		
		//Q20
		System.out.println("Q20: ");
		Q20.reader();
		
	
	}
}	