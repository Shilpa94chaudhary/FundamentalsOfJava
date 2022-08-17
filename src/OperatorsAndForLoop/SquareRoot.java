package OperatorsAndForLoop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		long num, i, sqRoot=0;
		num = s.nextLong();
		
		for (i = 0; i<= num; i++) {
			if(i*i > num) {
				break;
			}
			sqRoot = i;
		}
		System.out.println(sqRoot);

	}

}
