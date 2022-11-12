package Array;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = s.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the elements of Array:");
		for(int i=0 ; i<n ; i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("Array entered:");
		for(int i=0 ; i<n ; i++) {
			System.out.println(arr[i]);
		}

	}

}
