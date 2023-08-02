package recursion;

import java.util.Scanner;

public class PrintNto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
		arr=ntoOneArray(n, n, arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] ntoOneArray(int n,int size, int[] arr)
	{
		arr[n-1]=size-(n-1);
		if(n==1)
			return arr;
		return ntoOneArray(--n, size, arr);
	}
}
