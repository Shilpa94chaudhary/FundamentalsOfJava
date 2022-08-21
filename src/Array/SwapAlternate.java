package Array;

public class SwapAlternate {
	
	public static void swapAlternate(int arr[]) {
    	int n = arr.length;
    	for(int i = 0; i<n-1 ; i=i+2) {
    		int temp = arr[i];
    		arr[i]= arr[i+1];
    		arr[i+1] = temp;
    	}
    }
	
	public static void printArray(int [] arr) {

		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		swapAlternate(arr);
		printArray(arr);
		
		int [] arr1 = {1,2,3,4,5,6};
		swapAlternate(arr1);
		printArray(arr1);

	}

}