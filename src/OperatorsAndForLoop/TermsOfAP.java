package OperatorsAndForLoop;
import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		
		/* Write a program to print first x terms 
		 * of the series 3N + 2 which are not multiples of 4.
		 * Sample Input 1 :
		 * 10
		 * Sample Output 1 :
		 * 5 11 14 17 23 26 29 35 38 41
		 */
		
		Scanner s = new Scanner(System.in);
		
		int i, x=1, n, AP;
		
		n = s.nextInt();
		
		for(i = 1 ; ; i++) {
			AP = 3*i + 2;
			if(x > n) {
				break;
			}
			if(AP % 4 == 0) {
				continue;
			}
			x++;
			System.out.print(AP + " ");
		}

	}

}
