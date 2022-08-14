package Patterns;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		
		//		Print
		//		n = 3
		//		*
		//		*1*
		//		*121*
		//		*12321*
		//		*121*
		//		*1*
		//		*
		
		Scanner s = new Scanner(System.in);

		int n, i=1, j, k, num;

		n = s.nextInt();
		
		System.out.println('*');
		
		while(i <= 2*n-1) {
			
			System.out.print('*');
			
			if(i <= n) {
				k = 1;
				while(k <= i-1) {
					System.out.print(k);
					k++;
				}
				k = i;
				while(k>0) {
					System.out.print(k);
					k--;
				}
			} else {
				k = 1;
				while(k <= 2*n-i-1) {
					System.out.print(k);
					k++;
				}
				k = 2*n - i;
				while(k>0) {
					System.out.print(k);
					k--;
				}
			}
			
			System.out.println('*');
			i++;
		}
		System.out.println('*');
		
	}

}
