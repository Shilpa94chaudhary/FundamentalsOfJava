package Array2;

public class SortZeroOneTwo {

	public static void sort012(int[] arr){
    	int n = arr.length;
    	int i, count0 = 0, count1 = 0, count2 = 0;
    	for(i = 0 ; i<n ; i++) {
    		if(arr[i]==0) {
    			count0++;
    		}else if(arr[i]==1) {
    			count1++;
    		}else {
    			count2++;
    		}
    	}
    	i=0;
    	while(count0>0) {
    		arr[i]=0;
    		i++;
    		count0--;
    	}
    	while(count1>0) {
    		arr[i]=1;
    		i++;
    		count1--;
    	}
    	while(count2>0) {
    		arr[i]=2;
    		i++;
    		count2--;
    	}
    }
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 0, 2, 0, 1};
		printArray(arr);
		sort012(arr);
		printArray(arr);
		
//		int[] arr = {2, 2, 0, 1, 1};
//		printArray(arr);
//		sort012(arr);
//		printArray(arr);
		
//		int[] arr = {0, 1, 2, 0, 1, 2, 0};
//		printArray(arr);
//		sort012(arr);
//		printArray(arr);

	}

}
