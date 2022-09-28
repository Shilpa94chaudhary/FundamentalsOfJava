package FunctionsAndScope;

import java.util.Scanner;

public class CheckPrime {
	
	public static boolean checkPrime(int n) {
		
		for(int i = 2; i <= n/2 ; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		
		int n = s.nextInt();
		
		if(checkPrime(n)) {
			System.out.println(n + " is Prime Number");
		}else {
			System.out.println(n + " is Composite Number");
		}

	}

}
