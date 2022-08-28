package TwoDimensionalArrays;

import java.util.Scanner;

public class SpiralPrint {

	public static int[][] inputArr(){
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
		return arr;
	}
	
	public static void spiralPrint(int arr [][]) {
		int rEnd = arr.length-1, cEnd = arr[0].length-1;
		int rStart = 0, cStart = 0;
		int r,c;
		while(rStart<rEnd && cStart<cEnd){
			r=rStart;
			for(c=cStart;c<=cEnd;c++) {
				System.out.print(arr[r][c]+" ");
			}
			rStart++;
			c=cEnd;
			for(r=rStart; r<=rEnd;r++) {
				System.out.print(arr[r][c]+" ");
			}
			cEnd--;
			r=rEnd;
			for(c=cEnd;c>=cStart;c--) {
				System.out.print(arr[r][c]+" ");
			}
			rEnd--;
			c=cStart;
			for(r=rEnd;r>=rStart;r--) {
				System.out.print(arr[r][c]+" ");
			}
			cStart++;
		}
	}
	
	public static void printArray(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		for(int i=0; i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
//		int[][] arr = inputArr();
//		printArray(arr);
//		spiralPrint(arr);
		
		
		int[][] arr = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
		printArray(arr);
		spiralPrint(arr);
	}

}
