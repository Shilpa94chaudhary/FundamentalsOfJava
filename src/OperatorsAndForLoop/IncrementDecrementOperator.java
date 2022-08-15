package OperatorsAndForLoop;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		
		int a = 60, b = 80;
		
		System.out.println("Befor checking if condition\na = " + a + ", b = " + b);
		System.out.println("Check this condition \'++a >60 && b++ > 80\'");
		
		if(a++ >60 && b++ > 80) {
			System.out.println("Inside if");
		}else {
			System.out.println("Inside else");
		}
		
		System.out.println("Values after checking if condition\na = " + a + ", b = " + b + "\n");
		
		/* a++ = 60 
		 * 60 > 60 false condition
		 * As first condition is false, 'if' will not execute check 
		 * second condition and execute else part
		 * so b++ > 80 condition is not checked and b's value is not
		 * incremented */
		
		a = 60; b = 80;
		
		System.out.println("Befor checking if condition\na = " + a + ", b = " + b);
		System.out.println("Check this condition \'++a >60 && b++ > 80\'");
		
		if(++a >60 && b++ > 80) {
			System.out.println("Inside if");
		}else {
			System.out.println("Inside else");
		}
		
		System.out.println("Values after checking if condition\na = " + a + ", b = " + b + "\n");
	}

}
