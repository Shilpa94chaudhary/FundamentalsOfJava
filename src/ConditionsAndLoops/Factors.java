package ConditionsAndLoops;
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n, i= 2;
		
		n = s.nextInt();
		
		while(i<=n/2) {
			if(n%i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
	}
}
