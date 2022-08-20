package Array;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int arr[], int x) {
		int l = arr.length;
		for(int i = 0; i<l ; i++) {
			if(arr[i]== x) {
				return i;
			}
		}
		return -1;
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int n = s.nextInt();
		System.out.println("Enter array:");
		int[] arr = new int[n];
		for(int i = 0; i<n ; i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("Find number: ");
		int x = s.nextInt();
		System.out.println("Number is at index "+linearSearch(arr,x));

	}

}
