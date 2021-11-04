package MyPackage;

public class QThree {
	public void reverseString (String str) {
	
	//String sa = "Hello";
	String sb = "";
	
	for (int i = str.length() - 1; i >= 0; --i) {
		sb += str.charAt(i);
	}
	
	System.out.println("Q3: " + sb);

	}
}
