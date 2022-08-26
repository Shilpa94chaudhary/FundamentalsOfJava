package TwoDimensionalArrays;

public class TwoDArray {

	public static void main(String[] args) {
		int arr[][] = new int [3][3];
		
		for(int i=0; i<3 ; i++) {
			for(int j= 0 ; j<3 ;  j++) {
				arr [i][j] = i*j;
			}
		}
		
		for(int i=0; i<3 ; i++) {
			for(int j=0 ; j<3 ;  j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
