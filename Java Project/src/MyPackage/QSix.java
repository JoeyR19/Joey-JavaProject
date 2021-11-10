package MyPackage;

public class QSix {
	
	public void evenOrOdd (int x) {
		//int x = 5;
		float y = ((float) x) / ((float) 2);
		int yi = x / 2;
		float yif = (float) yi;
		//System.out.println(y);
		//System.out.println(yi);
		//System.out.println(yif);
		
		if (y != yif) {
			System.out.println("Q6: is odd");
		} else {
			System.out.println("Q6: is even");
		}
	}
	
}
