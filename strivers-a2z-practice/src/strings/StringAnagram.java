package strings;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("anagram","nagaram"));

	}
    public static boolean isAnagram(String s, String t) {
    	if(s.length()!=t.length())
    	{
    		return false;
    	}
    	char[] ch1=s.toCharArray();
    	char[] ch2=t.toCharArray();
    	Map<Character,Integer> mp=new HashMap<Character,Integer>();
    	for(int i=0;i<s.length();i++)
    	{
    		if(mp.containsKey(ch1[i]))
    		{
    			mp.put(ch1[i], mp.get(ch1[i])+1);
    		}
    		else {
    			mp.put(ch1[i], 1);
    		}
    	}
    	for(int j=0;j<t.length();j++)
    	{
    		if(mp.containsKey(ch2[j]) && mp.get(ch2[j])>0)
    		{
    			mp.put(ch2[j], mp.get(ch2[j])-1);
    		}
    		else {
    			return false;
    		}
    	}
    	return true;
    }
}
