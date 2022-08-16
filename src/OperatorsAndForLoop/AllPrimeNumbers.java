package OperatorsAndForLoop;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int i = 2, j,n;
		boolean isPrime;
		n = s.nextInt();
		
		System.out.println(i);
		
		for(i = 3; i <= n ; i++) {
			isPrime = true;
			for(j=2; j <= i/2 ; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}

	}

}
