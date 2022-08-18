package FunctionsAndScope;

import java.util.Scanner;


public class FahrenheitToCelsiusTable {
	
	// printFahrenheitTable is function to print Fahrenheit to Celsius Table
	
	public static void printFahrenheitTable(int start, int end, int step) {

		for(int i = start; i<= end; i+=step){
			int c = (i-32)*5/9;
	        System.out.println(i + "\t" + c);
	    }
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sf, ef, w;
		
		sf = s.nextInt();
		ef = s.nextInt();
		w = s.nextInt();
		
		printFahrenheitTable(sf,ef,w);
		

	}

}
