package MyPackage;

import java.util.ArrayList;

public class QEight {
	public static void Palindrome () {
		ArrayList<String> notPalin = new ArrayList<String>();
		ArrayList<String> Palin = new ArrayList<String>();
		
		notPalin.add("karan");
		notPalin.add("madam");
		notPalin.add("tom");
		notPalin.add("civic");
		notPalin.add("radar");
		notPalin.add("jimmy");
		notPalin.add("kayak");
		notPalin.add("john");
		notPalin.add("refer");
		notPalin.add("billy");
		notPalin.add("did");
		System.out.println("Q8: " + notPalin);
		
		for (int i = 0; i < notPalin.size(); ++i) {
		
			String str = notPalin.get(i);
			String tempa = "";
			String tempb = "";
			int l = str.length();
			int lo = l / 2;
			//int a = l;
			//int b = a - lo;
			
			for (int j = l - 1; j >= (l - 1 - (lo - 1)); --j) {
				tempa += str.charAt(j);
			}
			//System.out.println("temp: " + tempa);
			
			for (int k = 0; k < lo; ++k) {
				tempb += str.charAt(k);
			}
			//System.out.println("temp: " + tempb);
			
			if (tempa.equals(tempb)) {
				Palin.add(notPalin.get(i));
			}
			
			//System.out.println(l);
			//System.out.println(lo);
			//String sub = str.substring(b, a);
			//System.out.println(sub);
		}
		System.out.println("Q8: " + Palin);
	}

}
