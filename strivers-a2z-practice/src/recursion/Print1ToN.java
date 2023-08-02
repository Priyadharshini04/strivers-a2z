package recursion;

import java.util.Scanner;

public class Print1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		arr = oneToNArray(n,arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] oneToNArray(int n, int[] arr)
	{
		arr[n-1]=n;
		if(n==1)
		{
			return arr;
		}
		return oneToNArray(--n,arr);
	}
}
