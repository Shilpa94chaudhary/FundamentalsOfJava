package Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("a");
		str.setCharAt(0, 'd');
		System.out.println(str);
		
		StringBuffer str1=new StringBuffer("");
		for(int i=0;i<5;i++)
		{
		    str1.append((char)('a'+i));
		}
		System.out.println(str1);
	}

}
