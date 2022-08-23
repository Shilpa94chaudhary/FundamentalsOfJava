package Strings;

import java.util.Scanner;

public class PrintStringCharacters {

	public static void printStrChar(String str) {
		int l = str.length();
		for(int i = 0 ; i<l ; i++) {
			System.out.println(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printStrChar(str);
	}

}
