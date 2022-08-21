package Array;

public class FindUnique {
	
//	public static int findUnique(int[] arr){
//		int n = arr.length;
//		int unique = arr[n-1];
//		boolean isUnique;
//		for(int i = 0; i< n-1; i++) {
//			isUnique = true;
//			if(arr[i] == Integer.MIN_VALUE) {
//				continue;
//			}
//			for(int j = i+1; j<n; j++) {
//				if(arr[j] == Integer.MIN_VALUE) {
//					continue;
//				}
//				if(arr[i]==arr[j]) {
//					isUnique = false;
//					arr[j] = Integer.MIN_VALUE;
//					break;
//				}
//			}
//			if(isUnique) {
//				unique=arr[i];
//				break;
//			}
//		}
//		return unique;
//    }
	
	public static int findUnique(int[] arr) {
		int n = arr.length;
		boolean visited[]= new boolean[n];
		boolean isUnique;
		int unique = 0;
		for(int i=0 ; i<n ; i++) {
			isUnique = true;
			if(visited[i] == false) {
				for(int j = i+1 ; j<n ; j++) {
					if(arr[i]==arr[j]) {
						visited[j]=true;
						isUnique = false;
						break;
					}
				}
				if(isUnique) {
					unique = arr[i];
				}
			}
		}
		return unique;
	}
	
	
	public static void printArray(int [] arr) {

		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] arr = {5,3,1,5,1,3,4,7,4,8,8 };
		printArray(arr);
		System.out.println(findUnique(arr));
		
		int [] arr1 = {1,2,3,4,4,3,2};
		printArray(arr1);
		System.out.println(findUnique(arr1));
		

	}

}
