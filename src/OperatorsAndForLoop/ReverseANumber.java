package OperatorsAndForLoop;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		/* Write a program to generate the reverse of a given number N. 
		 * Print the corresponding reverse number.
		 * Note : If a number has trailing zeros, 
		 * then its reverse will not include them. 
		 * For e.g., reverse of 10400 will be 401 instead of 00401.
		 */

		Scanner s = new Scanner(System.in);
		int n, newN=0, rem;

		n = s.nextInt();

		for(;;) {
			rem = n%10;
			newN = newN * 10 + rem;
			n = n/10;
			if(n == 0) {
				break;
			}
		}
		System.out.println(newN);

	}
}