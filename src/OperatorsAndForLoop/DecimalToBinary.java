package OperatorsAndForLoop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// Input range 0 to 10^5
		
		long numDec, numBin=0, i = 0, temp=0;
		numDec = s.nextInt();
		
		for(;;) {
			temp = (temp) * 10 + (numDec % 2);
			i++;
			numDec = numDec/2;
			if(numDec == 0) {
				break;
			}
		}
		for(;i>0;i--) {
			numBin = (numBin * 10) + (temp % 10) ;
			temp = temp/10;
		}
		System.out.println(numBin);
	}

}
