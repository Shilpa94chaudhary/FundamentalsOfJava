package Test2;

public class LeadersInArray {

//	public static void leaders(int[] input) {
//		int l = input.length;
//		for(int i=0; i<l; i++) {
//			boolean isLeader = true;
//			for(int j=i+1 ; j<l ; j++) {
//				if(input[i]<input[j]) {
//					isLeader = false;
//				}
//			}
//			if(isLeader) {
//				System.out.print(input[i]+" ");
//			}
//		}
//	}
	
	public static void leaders(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean allSmaller=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					allSmaller=false;
					break;
				}
			}
			if(allSmaller) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
//		int[] arr = {3, 12, 34, 2, 0, -1};
//		leaders(arr);
		
		int[] arr1 = {13, 17, 5, 4, 6};
		leaders(arr1);
		
	}

}
