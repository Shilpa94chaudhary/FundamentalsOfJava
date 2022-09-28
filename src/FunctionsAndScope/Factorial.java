package FunctionsAndScope;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int num) {
		int fact = 1;
		for(int i = 2; i<= num ; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		int n;
		n = s.nextInt();
		
		System.out.println(factorial(n));

	}

}
