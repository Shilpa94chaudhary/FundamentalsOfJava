package TwoDimensionalArrays;

public class RowWiseSum {

	public static void rowWiseSum(int[][] mat) {
		int sum;
		for(int i=0 ; i < mat.length ;i++) {
			sum=0;
			for(int j=0;j<mat[0].length;j++) {
				sum+=mat[i][j];
			}
			System.out.print(sum + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{-1,2,-3}};
		rowWiseSum(arr);
	}

}
