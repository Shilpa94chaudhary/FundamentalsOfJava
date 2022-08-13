package ConditionsAndLoops;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n, i=1;
		
		n = s.nextInt();
		
		while(i<=10) {
			System.out.println(n + " x " + i + " = " + i*n);
			i++;
		}

	}

}
