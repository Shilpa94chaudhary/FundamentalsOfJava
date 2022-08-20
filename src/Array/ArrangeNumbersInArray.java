package Array;

import java.util.Scanner;

public class ArrangeNumbersInArray {
	
	public static int[] arrange(int[] arr, int n) {
		int j = 1;
		if(n%2 == 0) {
			for (int i = 0; i< n/2 ; i++){
	    		arr[n-i-1] = j+1;
	    		arr[i] = j;
	            j+=2;
	        }
		}else {
			for (int i = 0; i<= n/2 ; i++){
	    		arr[n-i-1] = j+1;
	    		arr[i] = j;
	            j+=2;
	        }
		}
    	return arr;
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		arr = arrange(arr,n);
		for(int i = 0; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
