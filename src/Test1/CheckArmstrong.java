package Test1;

import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		
//		Input: 
//		4
//		Output: 
//		false
		
//		Input: 
//		371
//		Output: 
//		true
		
		
		Scanner s = new Scanner(System.in);
		int num, newNum = 0, temp;
		
		num = s.nextInt();
		temp = num;
		while(temp != 0) {
			int digit = temp % 10;
			newNum = newNum + (digit * digit * digit);
			temp = temp/10;
			
		}
		
		if (num == newNum) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
