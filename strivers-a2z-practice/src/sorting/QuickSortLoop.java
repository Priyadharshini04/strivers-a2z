package sorting;

import java.util.Arrays;

public class QuickSortLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		int[] oldarr={4,3,8,4,6,5};
		sortQuick(oldarr, 0, 5);
	    System.out.println(Arrays.toString(oldarr));

	}

	private static void sortQuick(int[] oldarr, int i, int j) {
		// TODO Auto-generated method stub
		if(i<j)
		{
			int pi=partition(oldarr,i,j);
			sortQuick(oldarr, i, pi-1);
			sortQuick(oldarr, pi+1, j);
			
		}
	}

	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int start=low;
		for(int i=low;i<high;i++)
		{
			if(arr[i]<=arr[high] && i!=high )
			{
				int temp=arr[start];
				arr[start]=arr[i];
				arr[i]=temp;
				start++;
			}
		}
		int temp=arr[start];
		arr[start]=arr[high];
		arr[high]=temp;
		return start;
	}

}
