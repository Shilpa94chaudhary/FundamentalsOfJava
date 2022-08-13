package Patterns;

import java.util.Scanner;

public class ParallelogramPattern {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int n, i=1, space, j;

		n = s.nextInt();
		
//		Print
//		n = 5
//		*****
//		 *****
//		  *****
//		   *****
//		    *****
		    
		while(i<=n) {
			
			space = i-1;
			
			while(space>0) {
				System.out.print(' ');
				space --;
			}
			
			j = 1;
			while(j<=n) {
				System.out.print('*');
				j++;
			}
			
			System.out.println();
			i++;
			
		}
		
	}

}