package TwoDimensionalArrays;

public class PrintLikeWave {

	public static void wavePrint(int mat[][]){
		int r=mat.length;
		if(r==0) {
			return;
		}
		int c=mat[0].length;
		for(int j=0;j<c;j++) {
			if(j%2==0) {
				for(int i=0;i<r;i++) {
					System.out.print(mat[i][j]+" ");
				}
			}else {
				for(int i=r-1;i>=0;i--) {
					System.out.print(mat[i][j]+" ");
				}
			}
		}
		System.out.println();
	}
	
	public static void printArray(int[][] arr) {
		int row = arr.length;
		if(row==0) {
			return;
		}
		int col = arr[0].length;
		for(int i=0; i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr1 = new int[0][0];
		printArray(arr1);
		wavePrint(arr1);
		
		int[][] arr = {
				{1, 2, 3, 4},
				{6, 7, 8, 9},
				{11, 12, 13, 14},
				{16, 17, 18, 19},
				{21, 22, 23, 24}};
		printArray(arr);
		wavePrint(arr);
	}

}
