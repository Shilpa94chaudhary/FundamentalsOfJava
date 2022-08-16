package OperatorsAndForLoop;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		
		/* Write a program that asks the user for 
		 * a number N and a choice C. And then give
		 *  them the possibility to choose between 
		 *  computing the sum and computing the product 
		 *  of all integers in the range 1 to N (both inclusive).
		 *  1, then print the sum
		 *  2, then print the product
		 *  Any other number, then print '-1' (without the quotes)
		 */
		
		Scanner s = new Scanner(System.in);
		
		int i, j, n, c, sum = 0, prod = 1;
		
		n = s.nextInt();
		c = s.nextInt();
		
		if(c == 1) {
			for(i = 1; i<=n ; i++) {
				sum += i;
			}
			System.out.println(sum);
		}else if(c == 2) {
			for(i = 1; i<=n ; i++) {
				prod *= i;
			}
			System.out.println(prod);
		}else {
			System.out.println("-1");
		}

	}

}
