package Array;

public class PrimitiveNonPrimitive {

	public static void incrementPri(int n) {
		n++;
	}
	
	public static int[] incrementNonPri(int [] arr) {
		arr = new int[7];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = arr[i]+1;
		}
		return arr;
	}
	
	public static void printArray(int [] arr) {

		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int n=5;
		int[] arr = {1,2,3,4,5};
		System.out.println("Primitive number befor function call: " + n);
		incrementPri(n);
		System.out.println("Primitive number after function call: " + n);
		
		System.out.println("Non Primitive numbers (array) befor function call: ");
		printArray(arr);
		arr = incrementNonPri(arr);
//		incrementNonPri(arr);
		System.out.println("Non Primitive numbers (array) after function call: ");
		printArray(arr);
		
		
		
	}

}
