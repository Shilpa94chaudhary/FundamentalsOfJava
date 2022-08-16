package OperatorsAndForLoop;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        int i, n, Fn=1, Fn0=0, Fn1=1;
        
        // Initialise Fn = 1, if n = 1 then Fn will be 1
        
        n = s.nextInt();
        
        for(i = 1; i<n; i++){
            Fn = Fn0 + Fn1;
            Fn0 = Fn1;
            Fn1 = Fn;
        }
        
		System.out.println(Fn);

	}

}