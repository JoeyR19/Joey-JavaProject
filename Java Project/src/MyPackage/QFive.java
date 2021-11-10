package MyPackage;

//import java.util.Arrays;

public class QFive {
	public void Index (String str, int idx) {
		char[] ch = new char[idx];
		
		for (int i = 0; i <= idx - 1; ++i) {
			ch[i] = str.charAt(i);
		}
		
		String newStr = new String(ch);
		
		/*
		String formatStr = Arrays.toString(ch)
				.replace(",", "")
				.replace("[", "")
				.replace(" ", "")
				.replace("]", "");
		*/
		System.out.println("Q5: substring of " + str + ": " + newStr);
	}
}
