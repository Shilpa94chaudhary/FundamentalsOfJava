package Array2;

public class RotateArray {

	public static void rotate(int[] arr, int d) {
		int n = arr.length; 
		if(d>n){
	            while(d>n){
	                d=d-n;
	            }
	        }
    	int[] tempArr = new int[d];
    	for(int i = 0 ; i<d ; i++) {
    		tempArr[i]=arr[i];
    	}
    	for(int i=0 ; i<n-d ; i++) {
    		arr[i]=arr[i+d];
    	}
    	int j=0;
    	for(int i = n-d ; i<n ; i++) {
    		arr[i]=tempArr[j];
    		j++;
    	}
    }
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5, 6, 7};
		printArray(arr);
		rotate(arr,3);
		printArray(arr);
		
		int arr2[] = {25, 6, 20, 55, 69, 5, 50, 63, 61, 41, 87, 80, 2, 96, 77, 70, 12, 43, 31, 8, 64, 41, 68, 18, 95, 79, 52, 74, 1, 98, 3, 26, 3, 74, 32, 23, 79, 81, 37, 39, 21, 24, 18, 22, 71, 47, 44};
		rotate(arr2, 132);
		printArray(arr2);
	}

}
