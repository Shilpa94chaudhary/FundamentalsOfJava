package Patterns;

import java.util.Scanner;

public class SumPatterns {

	public static void main(String[] args) {
		
//				Print
//				1=1
//				1+2=3
//				1+2+3=6
		
		Scanner s = new Scanner(System.in);

		int n, i=1, sum, j;

		n = s.nextInt();
		
		while(i<=n){
			sum=0;
			j=1;
			while(j<=i) {
				sum += j;
				if (j>1) {
					System.out.print("+");
				}
				System.out.print(j);
				j++;
			}
			System.out.println("=" + sum);
			i++;
		}

	}

}
