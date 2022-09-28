package FunctionsAndScope;

import java.util.Scanner;

public class CheckFibonacciNumber {
	
	public static boolean checkMember(int n){
		int f0 = 0, f1 = 1, f2;
		boolean isCheck = false;
		if(n == f0 || n == f1) {
			isCheck = true;
		}
		f2 = f0 + f1;
		while(f2<= n) {
			if (f2 == n) {
				isCheck = true;
			}
			f0 = f1;
			f1 = f2;
			f2 = f0 + f1;
		}
		
		return isCheck;
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		int num;
		num = s.nextInt();
		
		System.out.println(checkMember(num));

	}

}
