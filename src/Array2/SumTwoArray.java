package Array2;

public class SumTwoArray {

	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
		int n1=arr1.length;
        int n2=arr2.length;
        int n=output.length;
        int i, j = n1 - 1, k = n2 - 1, sum, rem = 0;
        for(i = n-1; i>=0 ; i--) {
        	if(j >= 0 && k >= 0) {
        		sum = arr1[j]+arr2[k]+rem;
            	output[i] = sum % 10;
            	rem = sum / 10;
            	j--; k--;
        	}else if(j >= 0) {
        		sum = arr1[j]+rem;
        		output[i] = sum % 10;
            	rem = sum / 10;
        		j--;
        	}else if(k >= 0) {
        		sum = arr2[k]+rem;
            	output[i] = sum % 10;
            	rem = sum / 10;
            	k--;
        	}else {
        		sum = rem;
            	output[i] = sum % 10;
            	rem = sum / 10;
        	}
        }
    }
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
//		int[] arr1 = {8, 5, 2};
//		int[] arr2 = {1, 3};
//		int[] output= new int[4];
//		sumOfTwoArrays(arr1, arr2, output);
//		printArray(output);
		
//		int[] arr1 = {9, 7, 6, 1};
//		int[] arr2 = {4, 5, 9};
//		int[] output= new int[5];
//		sumOfTwoArrays(arr1, arr2, output);
//		printArray(output);
		
		int[] arr1 = {6, 2, 4};
		int[] arr2 = {7, 5, 6};
		int[] output= new int[4];
		sumOfTwoArrays(arr1, arr2, output);
		printArray(output);
		
	}

}
