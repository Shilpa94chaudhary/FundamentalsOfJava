package ConditionsAndLoops;
import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int i = 1, n, sum = 0;
		
		n = s.nextInt();
		
		while(i<=n) {
			sum += i;
			i++;
		}
		
		System.out.println("Sum of " + n + " natural numbers = " + sum);
	}

}