package Test1;

import java.util.Scanner;

public class ZeroesAndStarPattern {

	public static void main(String[] args) {
		
//		Input:
//		4
//		Output:
//		*000*000*
//		0*00*00*0
//		00*0*0*00
//		000***000
		
//		Input:
//		5
//		Output:
//		*0000*0000*
//		0*000*000*0
//		00*00*00*00
//		000*0*0*000
//		0000***0000
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int l = 2*n + 1;
		
		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j <= l; j++) {
				if (j == i) {
					System.out.print("*");
				} else if(j == n+1) {
					System.out.print("*");
				} else if(j == l-i+1) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
