package Strings;

public class AllSubStrings {

	public static void printSubstrings(String str) {
		int l = str.length();
		for(int i = 0; i<l; i++) {
			for(int j=i+1 ; j<=l ; j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "Coding";
		System.out.println(str.substring(0,3));
		printSubstrings(str);
	}

}
