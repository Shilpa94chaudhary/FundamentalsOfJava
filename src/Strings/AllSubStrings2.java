package Strings;

public class AllSubStrings2 {

	public static void printSubstrings(String str) {
		int l = str.length();
		for(int i = 0; i<l; i++) {
			for(int j=0 ; j<l-i ; j++) {
				int start = j;
				int end = j+i+1;
				System.out.println(str.substring(start,end));
			}
		}
	}

	public static void main(String[] args) {
		String str = "Coding";
		printSubstrings(str);
	}

}