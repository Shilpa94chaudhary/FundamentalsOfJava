package OperatorsAndForLoop;

import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		long i, num, num0, num1;
		boolean sDec = true, sInc = false, seq = true;
		num = s.nextLong();
		
        if(num == 1) {
			num1 = s.nextLong();
			System.out.println("false");
			return;
		}else if(num == 2) {
			num0 = s.nextLong();
			num1 = s.nextLong();
			if(num0 == num1) {
				System.out.println("false");
				return;
			}else {
				System.out.println("true");
				return;
			}
			
		}
		
		num0 = s.nextLong();
        for(i = 1; i<num; i++){
            num1 = s.nextLong();
            if(num0 == num1){
                seq = false;
            }else if(num0 > num1){
                if(sDec){
                    num0 = num1;
                    continue;
                }else {
                    seq = false;
                }
            }else {
                sInc = true;
                sDec = false;
                num0 = num1;
            }
        }
		
		if(seq) {
			System.out.println("true");
		}else
			System.out.println("false");

	}

}
