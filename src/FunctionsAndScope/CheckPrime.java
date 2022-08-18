package FunctionsAndScope;

import java.util.Scanner;

public class CheckPrime {
	
	public static boolean checkPrime(int n) {
		boolean isPrime = true;
		
		for(int i = 2; i <= n/2 ; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		int n = s.nextInt();
		
		if(checkPrime(n)) {
			System.out.println(n + " is Prime Number");
		}else {
			System.out.println(n + " is Composite Number");
		}

	}

}
