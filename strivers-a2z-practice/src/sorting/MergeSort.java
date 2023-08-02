package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,13,4 ,1,3,6,28};
		mergeSort(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
	public static void mergeSort(int[] arr,int start,int end)
	{
		if(start<end)
		{
			int center=(start+end)/2;
			mergeSort(arr,start,center);
			mergeSort(arr,center+1,end);
			merge(arr,start,end,center);
		}
	}
	private static void merge(int[] arr, int start, int end,int center) {
		// TODO Auto-generated method stub
		int[] arr1=new int[center-start+1];
		int[] arr2=new int[end-center];
		int i=0;
		int j=0;
		int k=start;
		int n1=start;
		int n2=center+1;
		while(i<arr1.length)
		{
			arr1[i]=arr[n1];
			i++;
			n1++;
		}
		while(j<arr2.length)
		{
			arr2[j]=arr[n2];
			n2++;
			j++;
		}
		i=0;
		j=0;
		while(k<arr.length && i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				arr[k]=arr1[i];
				i++;
			}
			else {
				arr[k]=arr2[j];
				j++;
			}
			 k++;
		}
		while(i<arr1.length && k<arr.length)
		{
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length && k<arr.length)
		{
			arr[k]=arr2[j];
			k++;
			j++;
		}
	}
}
