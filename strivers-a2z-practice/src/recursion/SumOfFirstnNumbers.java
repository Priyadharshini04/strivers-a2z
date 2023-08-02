package recursion;

import java.util.Scanner;

public class SumOfFirstnNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print(sumOfN(0,x));
	}
	public static int sumOfN(int total,int n)
	{
		total+=n;
		if(n==0)
			return total;
		return sumOfN(total,--n);
	}
}
