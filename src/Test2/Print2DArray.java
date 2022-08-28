package Test2;

public class Print2DArray {
	
	public static void print2DArray(int input[][]) {
		if(input.length==0) {
			return;
		}
		int n = input.length;
		int m = input[0].length;
		for(int i=0; i<n; i++) {
			for(int k=0; k<n-i ; k++) {
				for(int j=0; j<m ; j++) {
					System.out.print(input[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
				};
		print2DArray(arr);
	}

}
