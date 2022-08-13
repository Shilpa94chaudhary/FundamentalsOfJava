package ConditionsAndLoops;

import java.util.Scanner;

public class CheckPrimality {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int i = 2, n;
		boolean isPrime = true;
		
		n = s.nextInt();
		
		while(i<=n/2) {
			if(n%i==0) {
				isPrime = false;
			}
			i++;
		}
		
		if(isPrime) {
			System.out.println(n + " is Prime Number");
		}else {
			System.out.println(n + " is Composite Number");
		}

	}

}
