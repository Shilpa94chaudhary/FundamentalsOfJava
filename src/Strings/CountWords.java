package Strings;

import java.util.Scanner;

public class CountWords {

	public static int countWords(String str) {	
		int count =0;
		if(str.length()==0) {
			return count;
		}
		for(int i=0 ; i<str.length() ; i++)
		{
			if(str.charAt(i)==' ' && i == 0) {
				continue;
			} else if(str.charAt(i)==' ' && i == str.length()-1 ) {
				continue;
			}else if(str.charAt(i)==' ') {
				count++;
			}
		}
		return count+1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(countWords(str));

	}

}
