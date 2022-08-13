package Patterns;

import java.util.Scanner;

public class TriangleOfNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n, i=1,j,space;

		n = s.nextInt();

		//		Print
		//		n = 4
		//		   1
		//		  232
		//		 34543
		//		4567654


		while(i<=n) {

			space = 1;
			while(space<=n-i) {
				System.out.print(' ');
				space++;
			}

			j=1;
			int num = i;
			while(j<=i) {
				System.out.print(num);
				num++;
				j++;
			}

			num -= 2;
			j -= 2;
			while(j>0) {
				System.out.print(num);
				num--;
				j--;
			}

			System.out.println();
			i++;
		}

	}

}
