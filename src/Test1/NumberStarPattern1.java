package Test1;

import java.util.Scanner;

public class NumberStarPattern1 {

	public static void main(String[] args) {
		
//		Input: 
//		4
//		Output: 
//		432*
//		43*1
//		4*21
//		*321
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for (int j = n; j>0 ; j--) {
				if(i == j) {
					System.out.print("*");
				}else {
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}

}
