package ConditionsAndLoops;
import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		/*  Given three values - Start Fahrenheit Value (S),
		 *  End Fahrenheit value (E) and Step Size (W), 
		 *  you need to convert all Fahrenheit values from 
		 *  Start to End at the gap of W, into their corresponding
		 *  Celsius values and print the table.  
		 *  3 integers - S, E and W respectively 
		 *  0 <= S <= 90
		 *  S <= E <=  900
 		 *  0 <= W <= 80 
 		 *  Input 
 		 *  0  
 		 *  100
 		 *  20 
 		 *  Output
 		 *  0   -17 
 		 *  20  -6 
 		 *  40  4 
 		 *  60  15 
 		 *  80  26 
 		 *  100 37  */
		

		Scanner s = new Scanner(System.in);

		int S, E, W, C;
		S = s.nextInt();
		E = s.nextInt();
		W = s.nextInt();

		while(S<=E) {
			C = ((S-32)*5)/9;
			System.out.println(S + " " + C);
			S += W;
		}

	}
}
