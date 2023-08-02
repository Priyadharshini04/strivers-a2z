package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSort(new int[]{2,13, 4,1,3,6,28}, 7);
	}
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i=0;i<size-1;i++)
        {
          int j=i;
          int key=arr[i+1];
          while(j>=0&&arr[j]>key)
          {
              arr[j+1]=arr[j];
              --j;
          }

          arr[j+1]=key;
        }
    }
}
