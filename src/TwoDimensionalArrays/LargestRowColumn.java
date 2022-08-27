package TwoDimensionalArrays;

public class LargestRowColumn {

	public static void findLargest(int mat[][]){
		int row = mat.length;
		int sumRow=Integer.MIN_VALUE;
		int lagRow=0;
		if(row==0){
            System.out.println("row "+ lagRow + " " + sumRow);
            return;
        }
		int col = mat[0].length, sumCol = Integer.MIN_VALUE, larCol=0;
		for(int i=0 ; i < row ; i++) {
			int sum=0;
			for(int j=0; j<col ; j++) {
				sum+=mat[i][j];
			}
			if(sumRow < sum) {
				sumRow = sum;
				lagRow = i;
			}
		}
		for(int j=0; j<col ; j++) {
			int sum=0;
			for(int i=0 ; i < row ; i++) {
				sum+=mat[i][j];
			}
			if(sumCol < sum) {
				sumCol = sum;
				larCol = j;
			}
		}
		if (sumRow >= sumCol) {
			System.out.println("row "+ lagRow + " " + sumRow);
		}else {
			System.out.println("column "+ larCol + " " + sumCol);
		}
		
	}
	
	public static void main(String[] args) {
//		int[][] arr = {{2,2},{1,1},{1,1}};
//		findLargest(arr);
		
//		int[][] arr = {{}};
//		findLargest(arr);
		
		int[][] arr = new int [0][0];
		findLargest(arr);
	}

}