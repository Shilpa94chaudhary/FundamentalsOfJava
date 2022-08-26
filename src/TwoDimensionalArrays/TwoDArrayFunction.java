package TwoDimensionalArrays;
import java.util.Scanner;

public class TwoDArrayFunction {

	public static int[][] inputArray(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int row = s.nextInt();
		System.out.println("Enter number of column:");
		int col = s.nextInt();
		System.out.println("Enter array:");
		int arr[][]= new int[row][col];
		for(int i=0; i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}

	public static void printArray(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		for(int i=0; i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		
		int [][] arr= inputArray();
		printArray(arr);

	}

}
