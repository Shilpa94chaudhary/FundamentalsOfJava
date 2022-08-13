package Patterns;

import java.util.Scanner;

public class MirrorImagePattern {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n, i=1, space = 0, j;

		n = s.nextInt();

		//		Print
		//	       *
		//	      **
		//	     ***
		//	    ****
		//	   *****


//		while(i<=n) {
//			space = n-i;
//			while(space>0) {
//				System.out.print(' ');
//				space--;
//			}
//			
//			j=1;
//			while(j<=i) {
//				System.out.print('*');
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		// or
		
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
			
			System.out.println();
			i++;
		}

	}

}
