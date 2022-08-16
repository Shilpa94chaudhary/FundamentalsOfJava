package OperatorsAndForLoop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int i,j,numBinary, numDecimal=0, rem, numPoweri;
		
		numBinary = s.nextInt();
		
		for(i=0;;i++ ) {
			
			numPoweri = 1;
			for(j=i;j>0;j--) {
				numPoweri *= 2;
				
			}
			rem = numBinary % 10;
			numDecimal += (rem * numPoweri);
			numBinary = numBinary/10;
			if(numBinary == 0) {
				break;
			}
		}
		System.out.println(numDecimal);		
				
	}

}
