package Test2;

public class MinimumLengthWord {

		public static String minimumLengthWord(String str) {
			int l=str.length();
			int sIndex=0, eIndex=0, minLength=Integer.MAX_VALUE, length=0,space=0;
			for(int i=0 ; i<=l ; i++) {
				if(i==0 && str.charAt(i)==' ') {
					continue;
				}
				if(i == l || str.charAt(i)==' ') {
					if(minLength>length) {
						minLength = length;
						sIndex = space;
						eIndex = i;
					}
					space = i+1;
					length=0;
				}
				length++;
			}
			return str.substring(sIndex,eIndex);
		}
		
		public static void main(String[] args) {
			String str = " This is a fruit";
			System.out.println(minimumLengthWord(str));
		}
}