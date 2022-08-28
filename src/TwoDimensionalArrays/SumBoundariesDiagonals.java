package TwoDimensionalArrays;

public class SumBoundariesDiagonals {

	public static void totalSum(int[][] mat) {
		int sum=0, N=mat.length;
		if(N==0) {
			System.out.println(sum);
			return;
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i==0 || i==N-1 || j==0 || j==N-1) {
					sum+=mat[i][j];
				}else if(i==j || i+j == N-1) {
					sum+=mat[i][j];
				}
			}
		}
		System.out.println(sum);
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
		
//		int[][] arr = 
//			   {{1,2,3,4},
//				{1,2,3,4},
//				{1,2,3,4},
//				{1,2,3,4}};
//		printArray(arr);
//		totalSum(arr);
		
//		int[][] arr = {
//				{1, 2, 3, 10},
//				{4, 5, 6, 11},
//				{7, 8, 9, 12},
//				{13, 14, 15, 16}};
//		printArray(arr);
//		totalSum(arr);
		
		int[][] arr = {
					{1, 2, 3, 4, 5},
					{6, 7, 8, 9, 10},
					{11, 12, 13, 14, 15},
					{16, 17, 18, 19, 20},
					{21, 22, 23, 24, 25}};
		printArray(arr);
		totalSum(arr);
	}

}
