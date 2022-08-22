package Array2;

public class CheckArrayRotation {

	public static int arrayRotateCheck(int[] arr){
    	int n=arr.length;
    	int index = 0, preNum = Integer.MIN_VALUE;
    	for(int i = 0 ; i<n ; i++) {
    		if(preNum > arr[i]) {
    			index = i;
    			return index;
    		}
    		preNum=arr[i];
    	}
    	return index;
    }
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
//		int[] arr = {5, 6, 1, 2, 3, 4};
//		printArray(arr);
//		System.out.println(arrayRotateCheck(arr));
		
//		int[] arr = {3, 6, 8, 9, 10};
//		printArray(arr);
//		System.out.println(arrayRotateCheck(arr));
		
		int[] arr = {10, 20, 30, 1};
		printArray(arr);
		System.out.println(arrayRotateCheck(arr));
		
	}

}
