package Strings;

public class RemoveConsecutiveDuplicates {

	public static String removeConsecutiveDuplicates(String str) {
		String newStr= "";
		char ch = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) != ch) {
				newStr = newStr + str.charAt(i);
				ch = str.charAt(i);
			}
		}
		return newStr;
	}
	
	public static void main(String[] args) {
		String str = "aaabbcaa";
		System.out.println(removeConsecutiveDuplicates(str));
		
//		String str = "xxyyzxx";
//		System.out.println(removeConsecutiveDuplicates(str));
	}

}
