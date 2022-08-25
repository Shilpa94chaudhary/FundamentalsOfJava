package Strings;

public class ReverseStringWordwise {

	public static String reverseWordWise(String input) {
		String ans="", newWord="";
		int i = 0;
		for(; i < input.length(); i++) {
			if(input.charAt(i)!=' ') {
				newWord += input.charAt(i);
			}else {
				
				System.out.println(newWord);
				ans = newWord + ans;
				ans = ' ' + ans;
				newWord="";
			}
		}
		ans = newWord + ans;
		return ans;
	}
	
	public static void main(String[] args) {
		String str = "Welcome to Coding Ninjas";
		System.out.println(reverseWordWise(str));

	}

}
