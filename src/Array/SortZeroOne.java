package Array;

public class SortZeroOne {

//	Find no of zero and assign zero and one
	public static void sortZeroesAndOne(int[] arr) {
    	int n=arr.length;
    	int count = 0, i;
    	
    	for(i=0;i<n;i++) {
    		if(arr[i]==0)
    			count++;
    		}
    	for(i=0; i<count ; i++) {
    		arr[i]=0;
    	}
    	
    	for(i=count; i<n; i++) {
    		arr[i]=1;
    	}
    }
	
//	Sorting in Array
//	public static void sortZeroesAndOne(int[] arr) {
//    	int n=arr.length;
//    	int temp,i,j;
//    	for(i=0;i<n-1;i++) {
//    		for(j=i+1; j<n; j++) {
//    			if(arr[i]==1 && arr[j]==0) {
//    				temp = arr[i];
//    				arr[i] = arr[j];
//    				arr[j] = temp;
//    				break;
//    			}
//    		}
//    	}
//    }
	
//	public static void sortZeroesAndOne(int[] arr) {
//    	int n=arr.length;
//    	int temp,i,j,lastIndex=n-1;
//    	for(i=0;i<n-1;i++) {
//    		for(j=i+1; j<n; j++) {
//    			if(arr[i]==1 && arr[j]==0) {
//    				temp = arr[i];
//    				arr[i] = arr[j];
//    				arr[j] = temp;
//    				if(lastIndex == j) {
//    					return;
//    				}
//    				break;
//    			}
//    		
//    		}
//    	}
//    }
	
//	public static void sortZeroesAndOne(int[] arr) {
//		int n=arr.length;
//        boolean noZero;
//    	for(int i=0;i<n-1;i++) {
//            noZero = true;
//    		for(int j=i+1; j<n; j++) {
//    			if (arr[j]==0){
//                    noZero = false;
//                }
//    			if(arr[i]==1 && arr[j]==0) {
//    				int temp = arr[i];
//    				arr[i] = arr[j];
//    				arr[j] = temp;
//    				break;
//    			}
//    		}
//            if(noZero){
//                break;
//            }
//    	}
//    }
	
	public static void printArray(int [] arr) {

		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		int[] arr = {0, 1, 1, 0, 1, 0, 1};
//		sortZeroesAndOne(arr);
//		printArray(arr);
		
//		int[] arr = {1, 0, 1, 1, 0, 1, 0, 1};
//		sortZeroesAndOne(arr);
//		printArray(arr);
		
//		int[] arr = {1, 1, 1, 1, 0, 0, 0};
//		sortZeroesAndOne(arr);
//		printArray(arr);
		
		int[] arr = {0, 1, 1, 0, 1, 0, 1,0,0,0,0,0,0,0};
		sortZeroesAndOne(arr);
		printArray(arr);

	}

}
