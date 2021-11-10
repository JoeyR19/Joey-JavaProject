package MyPackage;

public class QEighteen extends Abstract18 {
	
	//System.out.println("Q18: ");

	@Override
	public boolean anyUpper(String s) {
		
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
	public String lowerCase(String s) {
		System.out.println(s.toUpperCase());
		return s.toUpperCase();
		
	}

	@Override
	public int convertToInt(String s) {
		char[] ch = s.toCharArray();
		
		int total = 0;
		
		for (char c : ch) {
			total += (int) c;
		}
		//int n = Integer.parseInt(s);
		total += 10;
		System.out.println("sum of converted string plus 10: " + total);
		return total;
		
	}
	
	
	
}
