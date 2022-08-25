package Strings;

public class ReverseEachWord {
	
	/* Input : Shilpa Chaudhary
	 * Output : aplihS yrahduahC
	 */

	public static String reverseEachWord(String str) {
		String ans="", reverseWord="";
		int i = 0;
		for(; i < str.length(); i++) {
			if(str.charAt(i)!=' ') {
				reverseWord = str.charAt(i)+reverseWord;
			}else {
				ans += reverseWord;
				ans = ans + ' ';
				reverseWord="";
			}
		}
		ans += reverseWord;
		return ans;
	}
	
	
	public static void main(String[] args) {
		String str = "Shilpa Chaudhary";
		System.out.println(reverseEachWord(str));
	}

}
