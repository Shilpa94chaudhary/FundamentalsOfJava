package Array;

import java.util.Scanner;

public class InputOutputArrayInFunction {

	
	public static void printArr(int arr[]) {
		int n = arr.length;
		System.out.println("Array entered:");
		for(int i=0 ; i<n ; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] takeInputArr() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Array:");
		for(int i=0 ; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = takeInputArr();
		printArr(arr);
		
	}

}
