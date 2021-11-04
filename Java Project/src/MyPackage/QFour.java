package MyPackage;

public class QFour {
	
	public void Factorial (int myFact) {
		
		//int x = 10;
		int f = 0;
		
		for (int i = myFact; i >= 0; --i) {
			if (i == myFact) {
				f = myFact;
				//System.out.println(f);
				if (myFact == 1) {
					System.out.println("Q4: " + f);
				}
			} else {
				f = f * i;
				if (i == 1) {
					System.out.println("Q4: " + f);
				}
			}
		}
		
	}
}
