package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Long n = sc.nextLong();
		List<Long> list=new ArrayList<Long>();
		list = factorialNumber(1L,n,list,1L);
		list.forEach(i->System.out.print(i+" "));

	}
	public static List<Long> factorialNumber(Long n,Long max, List<Long> list, Long fact)
	{
		fact=fact*n;
		if(fact>max)
			return list;
		list.add(fact);
		return factorialNumber(++n,max,list,fact);
	}
}
