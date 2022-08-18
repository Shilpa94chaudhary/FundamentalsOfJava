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
		
		
//		Scanner s = new Scanner(System.in);
//		int num, newNum = 0, temp;
//		
//		num = s.nextInt();
//		temp = num;
//		while(temp != 0) {
//			int digit = temp % 10;
//			newNum = newNum + (digit * digit * digit);
//			temp = temp/10;
//			
//		}
//		
//		if (num == newNum) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp, sum=0;
        
        
        for(temp = n; temp > 0;){
            int prod = 1;
            for (int temp1 = n; temp1 >0; ){
                prod = prod * (temp%10);
                temp1 = temp1/10;
                
            }
            sum += prod;
            temp = temp/10;
        }

        if(sum == n) {
        	System.out.println(true);
        }else {
        	System.out.println(false);
        }

	}

}
