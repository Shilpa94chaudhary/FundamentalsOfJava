package TwoDimensionalArrays;

import java.util.Scanner;

public class inputTwoDArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row, col;
		System.out.println("Enter number of rows:");
		row = s.nextInt();
		System.out.println("Enter number of column:");
		col = s.nextInt();
		
		int arr[][] = new int [row][col];

		System.out.println("Enter array:");
		
		for(int i=0; i<row ; i++) {
			for(int j= 0 ; j<col ;  j++) {
				arr [i][j] = s.nextInt();
			}
		}
		
		for(int i=0; i<row ; i++) {
			for(int j=0 ; j<col ;  j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
