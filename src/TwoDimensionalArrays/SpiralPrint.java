package TwoDimensionalArrays;

import java.util.Scanner;

public class SpiralPrint {

	public static void spiralPrint(int arr [][]) {
		if(arr.length==0) {
			return;
		}
		int count = 0;
		int row= arr.length, col=arr[0].length;
		int rs=0, re=row-1, cs=0, ce=col-1, i;
		while(count<row*col) {
			for(i=cs; i<=ce;i++) {
				System.out.print(arr[rs][i] + " ");
				count++;
			}
			rs++;
			
			for(i=rs; i<=re;i++) {
				System.out.print(arr[i][ce] + " ");
				count++;
			}
			ce--;
			if(rs>re) {
				return;
			}
			for(i=ce; i>=cs;i--) {
				System.out.print(arr[re][i] + " ");
				count++;
			}
			re--;
			if(cs>ce) {
				return;
			}
			for(i=re; i>=rs;i--) {
				System.out.print(arr[i][cs] + " ");
				count++;
			}
			cs++;
		}	
		System.out.println();
	}
	
	/* Code bug : when there is only one row/column then this 
	 * function print some elements again
	 * Input: 1 2 3 4
	 * Expected Output: 1 2 3 4
	 * Actual Output: 1 2 3 4 3 2 1
	 */
//	public static void spiralPrint(int matrix[][]){
//		if(matrix.length==0) {
//			return;
//		}
//		int rEnd = matrix.length-1, cEnd = matrix[0].length-1;
//		int rStart = 0, cStart = 0;
//		int r,c, count=0;
//		while(count<matrix.length*matrix[0].length){
//			r=rStart;
//			for(c=cStart;c<=cEnd;c++) {
//				System.out.print(matrix[r][c]+" ");
//				count++;
//			}
//			rStart++;
//			c=cEnd;
//			for(r=rStart; r<=rEnd;r++) {
//				System.out.print(matrix[r][c]+" ");
//				count++;
//			}
//			cEnd--;
//			r=rEnd;
//			for(c=cEnd;c>=cStart;c--) {
//				System.out.print(matrix[r][c]+" ");
//				count++;
//			}
//			rEnd--;
//			c=cStart;
//			for(r=rEnd;r>=rStart;r--) {
//				System.out.print(matrix[r][c]+" ");
//				count++;
//			}
//			cStart++;
//		}
//		System.out.println();
//	}

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
	
	public static void printArray(int[][] arr) {
		if(arr.length==0) {
			return;
		}
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
//		System.out.println();
//		int[][] arr1 = {
//				{1, 2, 3},
//				{4, 5, 6},
//				{7, 8, 9},
//				{10, 11, 12}
//				};
//		printArray(arr1);
//		spiralPrint(arr1);
//		System.out.println();
//		int[][] arr2 = {
//				{1,2,3,4},
//				{12,13,14,5},
//				{11,16,15,6},
//				{10,9,8,7}
//				};
//		printArray(arr2);
//		spiralPrint(arr2);
//		System.out.println();
		int[][] arr3 = {
				{1,2,3,4}
				};
		printArray(arr3);
		spiralPrint(arr3);
		System.out.println();
		int[][] arr4 = {
				{1},{2},{3},{4}
				};
		printArray(arr4);
		spiralPrint(arr4);
	}

}
