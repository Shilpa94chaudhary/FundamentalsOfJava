package Strings;

public class CompressTheString {

	public static String getCompressedString(String str) {
		String newStr = "";
		newStr += str.charAt(0);
		char ch=str.charAt(0);
		int countCh = 0;;
		for(int i = 0 ; i<str.length() ; i++) {
			if(ch == str.charAt(i)) {
				countCh++;
			}else if(countCh==1) {
				newStr += str.charAt(i);
				countCh = 1;
				ch = str.charAt(i);
			}else {
				newStr += countCh;
				newStr += str.charAt(i);
				countCh = 1;
				ch = str.charAt(i);
			}
		}
		if(countCh != 1) {
			newStr += countCh;
		}
		return newStr;
	}
	
	public static void main(String[] args) {

		String str = "aaabbbbbca";
		System.out.println(getCompressedString(str));

	}

}
