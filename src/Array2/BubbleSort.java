package Array2;

public class BubbleSort {
	
	public static void bubbleSort(int arr[]) {
		int n=arr.length;
		for(int i=0; i<n-1 ; i++) {
			printArray(arr);
			System.out.println();
			for(int j=0; j<n-i-1 ; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {9, 3, 6, 2, 0, 2};
		bubbleSort(arr);
		printArray(arr);
	}

}
