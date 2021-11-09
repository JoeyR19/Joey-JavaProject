package MyPackage;

//import java.util.Scanner;

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
		
		//Q11
		QEleven.OtherPac();
		
		//Q12
		QTwelve.enhanced();
		
		//Q13
		QThirteen.marioStairs(5);
		
		System.out.println();
		
		//Q14
		QFourteen.caseSwitch();
		
		//Q15
		QFifteen qfift = new QFifteen();
		qfift.Interfaces();
		
		//Q16
		//QSixteen.command();
		
		//Q17
		//QSeventeen.interest();
		
		//Q18
		System.out.println("Q18: ");
		QEighteen qet = new QEighteen();
		qet.anyUpper("any Upper case?");
		qet.anyUpper("any upper case?");
		qet.lowerCase("any Upper case?");
		qet.convertToInt("20");
		
		//Q19
		QNineteen.tenList();
		
		//Q20
		System.out.println("Q20: ");
		Q20.reader();
		
	
	}
}	