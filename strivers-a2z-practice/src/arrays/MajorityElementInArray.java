package arrays;
import java.util.Map;
import java.util.HashMap;
public class MajorityElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int majorityElement(int[] v)
	{
        int n=v.length/2;
        Map<Integer,Integer> hm=new  HashMap<Integer,Integer>();
        for(int i=0;i<v.length;i++)
        {
           if(hm.containsKey(v[i]) )
           {
        	   hm.put(v[i], hm.get(v[i])+1);
           }
           else {
        	   hm.put(v[i], 1);
           }
        }
      //  hm.entrySet().stream().filter();
        return 0;
	}
}
