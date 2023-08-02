package recursion;

import java.util.Scanner;

public class Fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1333;
		int realNum=num;
		int total=1;
		while(num>0)
		{
			num=num/10;
			total*=10;
		}
		System.out.println(total/10);
		
		
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
        int arr[]=new int[n];
        if(n==1)
        System.out.print(0);
        fibNocciSeries(1,arr,0,1);
    }
    public static int[] fibNocciSeries(int start,int[] arr,int a, int b)
	{
		if(start>=arr.length)
			return arr;
		arr[start]=b;
		int c=a;
		a=b;
		b=c+a;
		return fibNocciSeries(++start, arr, a, b);
	}
}
