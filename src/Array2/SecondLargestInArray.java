package Array2;

public class SecondLargestInArray {

	public static int secondLargestElement(int[] arr) {
		int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		for(int i=0 ; i<arr.length ; i++) {
			if(firstMax<arr[i]) {
				secondMax = firstMax;
				firstMax = arr[i];
			}else if(secondMax < arr[i] && firstMax != arr[i]) {
				secondMax = arr[i];
			}
		}
		return secondMax;
    }
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
//		int[] arr = {2, 13, 4, 1, 3, 6, 28};
//		printArray(arr);
//		System.out.println(secondLargestElement(arr));
		
//		int[] arr = {6, 6};
//		printArray(arr);
//		System.out.println(secondLargestElement(arr));
		
		int[] arr = {90, 8, 90, 5};
		printArray(arr);
		System.out.println(secondLargestElement(arr));

	}

}
