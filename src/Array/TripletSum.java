package Array;

public class TripletSum {

	
	public static int findTriplet(int[] arr, int x) {
    	int n=arr.length, count= 0;
    	int i,j,k;
    	for(i=0;i<n-2;i++) {
    		for(j=i+1;j<n-1;j++) {
    			for(k=j+1; k<n; k++) {
    				if(arr[i]+arr[j]+arr[k] == x) {
//    					System.out.println(i+ " " + j+ " " +k);
//    					System.out.println(arr[i]+ " " + arr[j]+ " " + arr[k]);
//    					System.out.println(arr[i]+arr[j]+arr[k]);
    					count++;
    				}
    				
    			}
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
//		int[] arr = {2, -5, 8, -6, 0, 5, 10, 11, -3};
//		System.out.println(findTriplet(arr,10));
		
//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
//		System.out.println(findTriplet(arr,12));
		
		int[] arr = {5, 5, 4, 4, 5, 4};
		System.out.println(findTriplet(arr,13));
		

	}

}
