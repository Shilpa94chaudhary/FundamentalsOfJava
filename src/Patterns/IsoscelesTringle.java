package Patterns;

import java.util.Scanner;

public class IsoscelesTringle {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n, i=1, space = 0, j;

		n = s.nextInt();


		//		Print 
		//		n = 5
		//			     1
		//			    121
		//			   12321
		//			  1234321
		//			 123454321

		while(i<=n) {
			space = 1;
			while(space<= n-i) {
				System.out.print(' ');
				space++;
			}
			j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}

			j=i-1;
			while(j>0) {
				System.out.print(j);
				j--;
			}

			System.out.println();
			i++;
		}

	}

}
