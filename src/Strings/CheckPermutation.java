package Strings;

import java.util.Arrays;

public class CheckPermutation {
	
//	public static boolean isPermutation(String str1, String str2) {
//		boolean isPer = false;
//		int l1 = str1.length(), l2 = str2.length();
//		if(l1 == 0 && l2 == 0) {
//			isPer = true;
//		}else {
//			for(int i = 0 ; i < l1 ; i++) {
//				isPer = false;
//				for(int j = 0 ; j < l2 ; j++) {
//					if(str1.charAt(i)== str2.charAt(j)) {
//						isPer = true;
//						break;
//					}
//				}
//				if(isPer == false) {
//					break;
//				}
//			}
//		}
//		return isPer;
//	}
	
	public static boolean isPermutation(String str1, String str2) {
		int m=str1.length();
		int n=str2.length();
		if(m!=n)
		return false;
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);  
		Arrays.sort(ch2);
		for(int i=0;i<n;i++)
		{
		if(ch1[i]!=ch2[i])
		return false;
		}
		return true;   
	}
	
	public static void main(String[] args) {
		String str1 = "sinrtg";
		String str2 = "string";
		System.out.println(isPermutation(str1,str2));

	}

}
