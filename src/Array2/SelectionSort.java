package Array2;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
    	int n=arr.length;
    	int min, minIndex;
    	for(int i=0 ; i<n-1 ; i++) {
    		min=arr[i];
    		minIndex = i;
    		for(int j=i ; j<n ;j++) {
    			// Find minimum value
    			if(arr[j]<min) {
    				min = arr[j];
    				minIndex = j;
    			}
    		}
    		// Swap minimum element with ith element
    		if(minIndex != i) {
    			int temp = arr[i];
    			arr[i]=arr[minIndex];
    			arr[minIndex]=temp;
    		}
    		printArray(arr);
    		System.out.println();
    	}
    }  
	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int [] arr = {9, 3, 6, 2, 0};
		selectionSort(arr);
		printArray(arr);

	}

}
