package Strings;

import java.util.HashMap;

public class HighestOccuringCharacter {

	public static char highestOccuringChar(String str) {
		int  l = str.length();
		char chArr[]=str.toCharArray();
		int[] countArr = new int[l];
		int i, j, countCh, index=0;
		for(i=0 ; i<l ; i++) {
			countCh=0;
			for(j=0 ; j<l ; j++) {
				if(chArr[i] == str.charAt(j)) {
					countCh++;
				}
			}
			countArr[i]=countCh;
		}
		countCh = Integer.MIN_VALUE;
		for(i=0 ; i<l ; i++) {
			if(countCh < countArr[i]) {
				index=i;
				countCh = countArr[i];
			}
		}
		
		return chArr[index];
	}
	
//	public static char highestOccuringChar(String str) {
//		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
//		
//		for(int i=0;i<str.length();i++) {
//			if(map.containsKey(str.charAt(i))) {
//				map.put(str.charAt(i), map.get(str.charAt(i))+1);
//			}else {
//				map.put(str.charAt(i),1);
//			}
//		}
//		int max=Integer.MIN_VALUE;
//		char maxChar='\0';
//		for(int i=0;i<str.length();i++) {
//			if(max<map.get(str.charAt(i))) {
//				max=map.get(str.charAt(i));
//				maxChar=str.charAt(i);
//			}
//		}
//		return maxChar;
//	}
	
	public static void main(String[] args) {
		String str = "aaabbbbbca";
		System.out.println(highestOccuringChar(str));
	}
}
