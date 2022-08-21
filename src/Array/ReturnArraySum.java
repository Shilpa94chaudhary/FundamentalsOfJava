package Array;

public class ReturnArraySum {
		
		public static int sum(int[] arr) {
			int n=arr.length, sum=0;
	        for(int i = 0; i<n ; i++){
	            sum = sum+arr[i];
	        }
	        return sum;
		}
	
	public static void printArray(int [] arr) {

		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6};
		printArray(arr);
		System.out.println(sum(arr));
	}
}
