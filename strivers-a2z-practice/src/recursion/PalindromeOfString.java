package recursion;

import java.util.Scanner;

public class PalindromeOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		char[] chArr=str.toCharArray();
		if(str==null)
			System.out.println(false);
		if(str.isEmpty() || str.trim().length()<=1)
			System.out.println(true);
		System.out.println(reverseString(chArr,0,chArr.length-1).equals(str));
		
	}
	public static String reverseString(char[] chArr, int start, int end)
	{
		
		if(start>=end)
		{
			return String.valueOf(chArr);
		}
		char a=chArr[start];
		chArr[start] = chArr[end];
		chArr[end] = a;
		return reverseString(chArr,++start, --end);
	}
}
