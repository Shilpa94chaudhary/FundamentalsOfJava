package Array2;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		int n=arr.length;
		for(int i=1; i<n; i++) {
			printArray(arr);
			System.out.println();
			int j = i-1;
			int temp = arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
//	public static void insertionSort(int[] arr) {
//		int n=arr.length;
//		
//		for(int i=1; i<n ; i++) {
//			int minIndex=0;
//			boolean swap = false;
//			printArray(arr);
//			System.out.println();
//			int min = arr[i];
//			for(int j=0 ; j<i ; j++) {
//				if(min < arr[j]) {
//					minIndex = j;
//					swap = true;
//					break;
//				}
//			}
//			if(swap) {
//				int temp = arr[i];
//				for(int k = i; k>minIndex ; k--) {
//					arr[k]=arr[k-1];
//				}
//				arr[minIndex]=temp;
//			}
//		}
//    }
	
	public static void printArray(int arr[]) {
		for(int i=0 ; i< arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 13, 4, 1, 3, 6, 28, 6};
		insertionSort(arr);
		printArray(arr);
	}

}
