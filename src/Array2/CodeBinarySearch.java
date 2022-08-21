package Array2;

public class CodeBinarySearch {

	public static int binarySearch(int[] arr, int x) {
		int start = 0, end = arr.length - 1, mid;
		while(start <= end){
			mid = (start + end)/2;
			if(arr[mid]==x) {
				return mid;
			}else if(x > arr[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
    }
	public static void main(String[] args) {
		
//		int [] arr = {1, 3, 7, 9, 11, 12, 45};
//		int x=3;
//		System.out.println(binarySearch(arr,x));
		
//		int [] arr = {1, 2, 3, 4, 5, 6, 7};
//		int x=9;
//		System.out.println(binarySearch(arr,x));
		
		int [] arr = {1, 3, 7, 9, 10, 13};
		int x=9;
		System.out.println(binarySearch(arr,x));
	}

}
