package recursion;

import java.util.Scanner;

public class RverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		nums = reverseArray(n,nums,0);
		for(int i=0;i<n;i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
	public static int[] reverseArray(int n,int[] arr, int start)
	{
		if(start>=n)
			return arr;
		int a=arr[start];
		arr[start]=arr[n-1];
		arr[n-1]=a;
		return reverseArray(--n,arr,++start);
	}
}