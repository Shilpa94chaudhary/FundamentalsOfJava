package Array2;

public class PushZeroToEnd {

//	public static void pushZerosAtEnd(int[] arr) {
//    	int n=arr.length;
//    	for(int i=0; i<n-1 ; i++) {
//    		for(int j=0 ; j<n-i-1 ;j++) {
//    			if(arr[j]==0) {
//    				arr[j]=arr[j+1];
//    				arr[j+1]=0;
//    			}
//    		}
//    	}
//    }
	
	public static void pushZerosAtEnd(int[] arr) {
    	int n=arr.length;
    	int i=0,j=0;
    	for(; i<n ; i++) {
    		if(arr[i] != 0) {
    			if(j==i) {
    				j++;
    				continue;
    			}
    			arr[j]=arr[i];
    			arr[i]=0;
    			j++; 
    		}
    	}
    }
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
//		int[] arr = {0, 13, 0, 1, 3, 0, 28, 6};
//		pushZerosAtEnd(arr);
//		printArray(arr);
		
		int[] arr = {1, 0, 0, 1, 3, 0, 0};
		pushZerosAtEnd(arr);
		printArray(arr);
	}

}
