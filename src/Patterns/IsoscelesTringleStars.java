package Patterns;

import java.util.Scanner;

public class IsoscelesTringleStars {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n, i=1, space = 0, j;

		n = s.nextInt();


		//		Print 
		//		n = 3
		//		  *
		//		 ***
		//		*****

		while(i<=n) {
			space = 1;
			while(space<= n-i) {
				System.out.print(' ');
				space++;
			}
			j=1;
			while(j<=i) {
				System.out.print('*');
				j++;
			}

			j=i-1;
			while(j>0) {
				System.out.print('*');
				j--;
			}

			System.out.println();
			i++;
		}

	}

}
