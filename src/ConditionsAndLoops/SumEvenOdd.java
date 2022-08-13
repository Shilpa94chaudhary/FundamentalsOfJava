package ConditionsAndLoops;
import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n, sumEven = 0, sumOdd = 0;
		
		n = s.nextInt();
		
		while(n>0) {
			if(n%2 == 0) {
				sumEven += (n%10);
			} else
				sumOdd += (n%10);
			
			n = n/10;
		}
		
		System.out.println("Sum of even numbers = " + sumEven);
		System.out.println("Sum of odd numbers = " + sumOdd);

	}

}
