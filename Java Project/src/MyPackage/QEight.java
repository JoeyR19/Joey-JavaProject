package MyPackage;

import java.util.ArrayList;

public class QEight {
	public static void main (String[] args) {
		ArrayList<String> notPalin = new ArrayList<String>();
		ArrayList<String> Palin = new ArrayList<String>();
		
		notPalin.add("karan");
		notPalin.add("madam");
		notPalin.add("tom");
		notPalin.add("civiv");
		notPalin.add("radar");
		notPalin.add("jimmy");
		notPalin.add("kayak");
		notPalin.add("john");
		notPalin.add("refer");
		notPalin.add("billy");
		notPalin.add("did");
		System.out.println(notPalin);
		
		String str = "refer";
		String temp = "";
		int l = str.length();
		int lo = l / 2;
		int a = l;
		int b = a - lo;
		
		for (int i = l - 1; i >= (l - 1 - (lo - 1)); --i) {
			temp += str.charAt(i);
		}
		System.out.println("temp: " + temp);
		
		//System.out.println(l);
		//System.out.println(lo);
		String sub = str.substring(b, a);
		//System.out.println(sub);
	}

}
