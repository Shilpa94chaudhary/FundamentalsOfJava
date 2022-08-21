package Array;

public class PairSum {

	public static int pairSum(int arr[], int x) {
    	int n = arr.length, count=0;
    	int i,j;
    	for(i=0; i<n-1; i++) {
    		for(j=i+1; j<n; j++) {
    			if(arr[i]+arr[j]== x) {
    				count++;
    			}
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
		int arr[] = {1, 3, 6, 2, 5, 4, 3, 2, 4};
		System.out.println(pairSum(arr,8));

	}

}
