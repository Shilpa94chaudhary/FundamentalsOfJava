package Strings;

public class RemoveCharacter {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String newStr="";
		for(int i=0 ; i<str.length() ; i++) {
			if(ch == str.charAt(i)) {
				continue;
			}else {
				newStr += str.charAt(i);
			}
		}
		return newStr;
	}
	
	public static void main(String[] args) {
		
		String str = "aaabbcaa";
		System.out.println(removeAllOccurrencesOfChar(str,'a'));

	}

}
