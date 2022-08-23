package Strings;

public class StringOperations {

	public static void main(String[] args) {
		
		// Initialize and print array
		
		char[] arr = {'C','o','d','i','n','g'};
		String str1 = "Coding";
		String str2 = "";
		
		// Print string
		System.out.println(str1);
		System.out.println(str2);
		
		// Print first character in character array
		System.out.println(arr[0]);
		
		// Print character at 0 index in string
		System.out.println(str1.charAt(0));
		
		// String is a non-primitive data type. 
		
		// The length() function returns an integer value : The String class length method returns an int
		
		// The maximum length of String in java is 2,14,74,83,647. 
		/* The maximum length that would be returned by the method 
		 * would be Integer.MAX_VALUE, which is 2^31 - 1, 
		 * which is equivalent to 2,14,74,83,647.
		 * */
		
		// Strings can store spaces as well. 
		
//		String a ="abcd";
//		String b="abcda";
//		System.out.println(a.compareTo(b));
		
//		String a="coding";
//		System.out.print(a.substring(2));
		
//		String a="coding";
//		for(int i=2;i<5;i++)
//		{
//		    System.out.print(a.substring(i-2,i+1));
//		}
		
		  String str01="abc";
	      String str11="abc";
	      String str21=new String("abc");
	      String str31="abc";
	      
	      System.out.println(str01 + " " + str11 + " " + str21 + " " + str31);
	      
	      str01 = "cda";
	      
	      System.out.println(str01 + " " + str11 + " " + str21 + " " + str31);

	}

}
