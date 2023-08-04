package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largestOddNumber("35472"));

	}
    public static String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--)
     	{
     		if(Character.getNumericValue(num.charAt(i)) %2!=0)
     		{
     			return num.substring(0,i+1);
     		}
     	}
     	return "";
     }
}