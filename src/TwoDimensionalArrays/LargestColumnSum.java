package TwoDimensionalArrays;

public class LargestColumnSum {

	public static int largestColSum(int[][] arr) {
		int row = arr.length, col = arr[0].length;
		int largest = Integer.MIN_VALUE;
		for(int j=0 ; j<col ; j++) {
			int sum = 0;
			for(int i=0 ; i<row ; i++) {
				sum+=arr[i][j];
			}
			if(largest<sum) {
				largest=sum;
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		int[][] arr = { {0,1,2,4,5}, {3,4,5,6,7},{5,6,7,8,9} }; 
	    System.out.println(largestColSum(arr)); 
	}

}
