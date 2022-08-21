package Array;

public class IntersectionOfTwoArrays {

	public static void intersections(int arr1[], int arr2[]) {
    	int n1 = arr1.length, n2= arr2.length;
    	boolean visited[] = new boolean [n2];
    	int i,j;
    	for(i=0;i<n1;i++) {
    		for(j=0;j<n2;j++) {
    			if(visited[j]!=true && arr1[i]==arr2[j]) {
    				visited[j]=true;
    				System.out.print(arr1[i] + " ");
    				break;
    			}
    		}
    	}
    }
	
	public static void main(String[] args) {
		int [] arr1 = {2,6,1,2};
		int [] arr2 = {1,2,3,4,2};
		intersections(arr1,arr2);

	}

}
