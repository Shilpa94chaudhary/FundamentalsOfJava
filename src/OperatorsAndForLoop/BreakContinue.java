package OperatorsAndForLoop;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i, n;
		n = s.nextInt();
		
		i=1;
		while(i<=n) {
			i++;
			System.out.print(i + " ");
		}
		System.out.println();
		
		// Use of break
		i=1;
		while(i<=n) {
			i++;
			if(i == 4) {
				System.out.print(" *Break* ");
				break;
//				System.out.print(" *Continue* "); any statement after break will give
//				an error as if break execute no statement after break will be executed
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		// Use of continue
		i=1;
		while(i<=n) {
			i++;
			if(i == 4) {
				System.out.print(" *Continue* ");
				continue;
//				System.out.print(" *Continue* "); any statement continue break will give
//				an error as if break execute no statement after break will be executed
			}
			System.out.print(i + " ");
		}
		
//		"break" is used to exit from the current loop.
//		"return" statement is used to exit from the current function.
//		"continue" is used to skip the current iteration of a loop and continue with the next iteration.		

	}

}
