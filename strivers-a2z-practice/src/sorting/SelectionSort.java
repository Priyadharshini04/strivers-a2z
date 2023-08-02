package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectionSort(new int[] {2,13,4,1,3,6,28});
	}
    public static void selectionSort(int[] arr) {
        //Your code goes here
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if( arr[min]> arr[j] )
                {
                    min = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
}
}
