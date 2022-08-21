package Array;

public class FindDuplicate {
	
	public static int duplicateNumber(int arr[]) {
    	int n = arr.length;
    	int duplicate=0;
    	boolean isDUplicate;
    	for(int i = 0; i <n ; i++) {
    		isDUplicate = false;
    		for(int j = i+1; j<n ; j++) {
    			if(arr[i] == arr[j]) {
    				isDUplicate = true;
    			}
    		}
    		if(isDUplicate) {
    			duplicate = arr[i];
    			break;
    		}
    	}
    	return duplicate;
    }
	
	public static void printArray(int [] arr) {

		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] arr = {3,9,2,1,4,6,7,5,8,0,7};
		printArray(arr);
		System.out.println(duplicateNumber(arr));
		
		int [] arr1 = {4,2,3,1,4,0};
		printArray(arr1);
		System.out.println(duplicateNumber(arr1));

	}

}
