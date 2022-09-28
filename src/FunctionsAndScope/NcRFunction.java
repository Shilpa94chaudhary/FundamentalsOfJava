package FunctionsAndScope;

import java.util.Scanner;

public class NcRFunction {
	
	public static int factorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact *=i;
		}
		return fact;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		int n, r, factN, factR, factNR, NcR;
		n = s.nextInt();
		r = s.nextInt();

		factN = factorial(n);
		factR = factorial(r);
		factNR = factorial(n - r);

		NcR = factN / (factR * factNR);

		System.out.println("NcR = " + NcR);

	}

}
