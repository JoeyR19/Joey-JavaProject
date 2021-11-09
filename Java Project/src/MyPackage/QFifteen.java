package MyPackage;

public class QFifteen extends QFifteenImpl{
	
	public void Interfaces() {
		QFifteenImpl q15 = new QFifteenImpl();
		myMath(q15);
	}
	
	public void myMath(QFifteenInterface q15) {
		//QFifteenImpl calc = new QFifteenImpl();
		double myNuma = 5;
		double myNumb = 7;
		System.out.println("Numbers: " + myNuma + ", " + myNumb);
		System.out.println("Add: " + q15.add(myNuma, myNumb));
		System.out.println("Subtract: " + q15.subtract(myNuma, myNumb));
		System.out.println("Multiply: " + q15.mult(myNuma, myNumb));
		System.out.println("Divide: " + q15.div(myNuma, myNumb));
	}
	
	
}
