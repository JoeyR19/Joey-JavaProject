package MyPackage;

public class QEighteen extends Abstract18 {
	
	//System.out.println("Q18: ");

	@Override
	boolean anyUpper(String s) {
		
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				System.out.println("true");
				return true;
			}
			//else
				//return false;
		}
		System.out.println("false");
		return false;
		
	}

	@Override
	String lowerCase(String s) {
		System.out.println(s.toUpperCase());
		return s.toUpperCase();
		
	}

	@Override
	int convertToInt(String s) {
		int n = Integer.parseInt(s);
		int su = n + 10;
		System.out.println("sum of converted string plus 10: " + su);
		return su;
		
	}
	
	
	
}
