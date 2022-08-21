package Array2;

public class MergeSortedArray {
	
	public static int[] merge(int arr1[], int arr2[]) {
		int n1 = arr1.length, n2 = arr2.length;
		int n = n1+n2, i=0, j=0, k=0;
		int[] arr = new int[n];
		
		for(k=0; k<n ; k++) {
			if(i==n1) {
				arr[k]=arr2[j];
				j++;
			}else if (j == n2) {
				arr[k]=arr1[i];
				i++;
			}else if(arr1[i]<arr2[j]) {
				arr[k]=arr1[i];
				i++;
			}else {
				arr[k]=arr2[j];
				j++;
			}
		}
	    return arr;
	}

//	public static int[] merge(int[] arr1, int[] arr2) {
//		int n1 = arr1.length, n2 = arr2.length;
//		int n = n1+n2, i=0, j=0, k=0;
//		int[] arr = new int[n];
//		while(i<n1 && j<n2) {
//			if(arr1[i]<arr2[j]) {
//				arr[k]=arr1[i];
//				i++;
//				k++;
//			}else {
//				arr[k]=arr2[j];
//				j++;
//				k++;
//			}
//		}
//		while(i<n1) {
//			arr[k]=arr1[i];
//			i++;
//			k++;
//		}
//		while(j<n2) {
//			arr[k]=arr2[j];
//			j++;
//			k++;
//		}
//		return arr;
//	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {1,3,7};
		int[] arr2 = {2,5,8,9};
		int[] arr = new int[7];
		arr = merge(arr1,arr2);
		printArray(arr);

	}

}
