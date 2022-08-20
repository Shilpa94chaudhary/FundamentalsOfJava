package Array;

import java.util.Scanner;

public class LargestOfNumber {

	public static int[] inputArr() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array:");
		for(int i = 0; i< n ; i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static int largestNum(int arr[]) {
		int l = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<l ; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int arr[] = inputArr();
		int lar = largestNum(arr);
		System.out.println("Larget number in array is " + lar);
	}

}
