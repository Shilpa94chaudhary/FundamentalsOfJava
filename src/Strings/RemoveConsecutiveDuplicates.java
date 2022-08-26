package Strings;

public class RemoveConsecutiveDuplicates {

	public static String removeConsecutiveDuplicates(String str) {
		String newStr= "";
		int l = str.length();
		char ch = 0;
		for(int i = 0 ; i < l ; i++) {
			if(str.charAt(i) != ch) {
				newStr = newStr + ch;
				ch = str.charAt(i);
			}
		}
		newStr = newStr + ch;
		return newStr;
	}
	
	public static void main(String[] args) {
		String str = "aaabbcaa";
		System.out.println(removeConsecutiveDuplicates(str));
		
//		String str = "xxyyzxx";
//		System.out.println(removeConsecutiveDuplicates(str));
	}

}
