package Strings;

public class ReverseString {

	// Travel from last index to 0 of the string
//	public static String reverseString(String str) {
//		String revStr = "";
//		for(int i = str.length() - 1 ; i>=0 ; i--) {
//			revStr += str.charAt(i);
//		}
//		return revStr;
//	}
	
	// Travel from 0 to last index of the string
	public static String reverseString(String str) {
		String revStr = "";
		for(int i = 0 ; i< str.length() ; i++) {
			revStr = str.charAt(i) + revStr;
		}
		return revStr;
	}
	
	public static void main(String[] args) {
		String str = "Shilpa Chaudhary";
		String revStr = reverseString(str);
		System.out.println(revStr);
	}

}
