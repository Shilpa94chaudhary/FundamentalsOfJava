package Strings;

public class StringPalindrome {

	// Check string is Palindrome using reversed string
//	public static boolean isPalindrome(String str) {
//		String revStr = "";
//		for(int i = str.length()-1 ; i>=0 ; i--) {
//			revStr += str.charAt(i);
//		}
//		if(str.compareTo(revStr)==0) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
	// Check string is Palindrome using comparing string character from beginning to end
		public static boolean isPalindrome(String str) {
			int lastIndex = str.length();
			for(int i = 0 ; i < str.length()/2 ; i++) {
				lastIndex--;
				// System.out.println(str.charAt(i) + " " + str.charAt(lastIndex));
				if(str.charAt(i) != str.charAt(lastIndex)){
					return false;
				}
			}
			return true;
		}
	
	public static void main(String[] args) {
		String str = "abcd ccba";
		System.out.println(isPalindrome(str));
	}

}
