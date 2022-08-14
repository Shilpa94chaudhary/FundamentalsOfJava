package Patterns;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {

		//		Print
		//		n = 4
		//		1357
		//		3571
		//		5713
		//		7135
		
		Scanner s = new Scanner(System.in);

		int n, i=1, j, k, num;

		n = s.nextInt();
		
		while(i<=n) {
			num = i*2 - 1;
			j = 1;
			while(j <= n-i+1) {
				System.out.print(num);
				num +=2 ;
				j++;
			}
			k = 1;
			num = 1;
			while(k <= i-1) {
				System.out.print(num);
				num += 2;
				k++;
			}
			System.out.println();
			i++;
		}


	}

}
