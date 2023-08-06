package sorting;

import java.util.Arrays;

public class QuickSortLetPivotPoint0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		int[] oldarr={4,3,8,4,6,5};
		quickSort(oldarr, 0, 5);
	    System.out.println(Arrays.toString(oldarr));
	}
	public static void quickSort(int[] arr,int start,int end)
	{
		if(start<end)
		{
			int pi=partition(arr, start, end,start);
			quickSort(arr, start, pi-1);
			quickSort(arr, pi+1, end);
		}
	}
	public static int partition(int[] arr,int pi,int end, int start)
	{
		int temp=arr[end];
			for(int i=end;i>=start;i--)
			{
				temp=arr[end];
				if(arr[pi]<arr[i])
				{
					arr[end]=arr[i];
					arr[i]=temp;
					end--;
				}
			}
			arr[end]=arr[pi];
			arr[pi]=temp;
		return end;
	}

}
