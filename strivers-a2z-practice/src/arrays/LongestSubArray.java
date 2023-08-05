package arrays;

public class LongestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(longestSubarrayWithSumK(new int[] {5,1,3,0,1,5,3,1,4,2},
		// 5));
		// System.out.println(longestSubarrayWithSumK(new int[] {1,2,1,3}, 2));
		// System.out.println(longestSubarrayWithSumK(new int[]
		// {0,2,5,3,3,4,4,3,0,5,5,4,4,4,3,2,0,2,3,1,3,0,4,3,1,4,5,2,4,3,1,4,5,0,3,4,0},
		// 52));
		// System.out.println(longestSubarrayWithSumK(new int[] {0,1,1,2,0,3}, 4));

		// System.out.println(longestSubarrayWithSumK(new int[]
		// {3,2,2,0,1,2,1,0,1,0,3,3,5,4,5,4,5,1,4,1,3,1,1,4,3,2,3,2,0,0,1,2,4,5,0,1,0,2,2,0,3,1,0,0,3,5,4,4,3,3,4,3,0,3,4,1,1,0,0,2},
		// 28));
		
//		
//		System.out.println(longestSubarrayWithSumKs(new int[] {5,1,3,0,1,5,3,1,4,2},
//		 5));
//		System.out.println(longestSubarrayWithSumKs(new int[] {1,2,1,3}, 2));
		 System.out.println(longestSubarrayWithSumKs(new int[]
		{0,2,5,3,3,4,4,3,0,5,5,4,4,4,3,2,0,2,3,1,3,0,4,3,1,4,5,2,4,3,1,4,5,0,3,4,0},
		 52));
		 System.out.println(longestSubarrayWithSumKkol(new int[]
					{-1,0,1,1,-1,-1,0},
					 0));
//		System.out.println(longestSubarrayWithSumKs(new int[] {0,1,1,2,0,3}, 4));
//
//		System.out.println(longestSubarrayWithSumKs(new int[]
//		 {3,2,2,0,1,2,1,0,1,0,3,3,5,4,5,4,5,1,4,1,3,1,1,4,3,2,3,2,0,0,1,2,4,5,0,1,0,2,2,0,3,1,0,0,3,5,4,4,3,3,4,3,0,3,4,1,1,0,0,2},
//		 28));
//		System.out.println(longestSubarrayWithSumKs(new int[]
//				 {8,15,17,0,11 },
//				 17));

	}

	public static int longestSubarrayWithSumK(int[] a, long k) {
		// Write your code here
		int maxCount = 0;
		int maxElements = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < k) {
				int total = a[i];
				maxElements = 1;
				for (int j = i + 1; j < a.length; j++) {
					if (total + a[j] <= k) {
						total += a[j];
						maxElements += 1;
						if (total == k) {
							if (j + 1 < a.length && a[j + 1] == 0) {
								maxElements += 1;
							}
							if (maxCount < maxElements) {
								maxCount = maxElements;
								maxElements = 0;
							}
							break;
						}
					} else if (total == k) {
						if (j + 1 < a.length && a[j + 1] == 0) {
							maxElements += 1;
						}
						if (maxCount < maxElements) {
							maxCount = maxElements;
							maxElements = 0;
						}
						break;
					} else {
						break;
					}
				}
			} else if (a[i] == k) {
				maxElements = 1;
				if ((i - 1 >= 0 && a[i - 1] == 0) || (i + 1 < a.length && a[i + 1] == 0)) {
					maxElements += 1;
				}
				if (maxCount < maxElements) {
					maxCount = maxElements;
					maxElements = 0;
				}
			}
		}
		return maxCount;
	}
	
	public static int longestSubarrayWithSumKs(int[] a, long k) {
		// Write your code here
		int maxCount = 0;
		int i=0;
		while(i<a.length)
		{
			int total=a[i];
			if(total>k){
				i++;
				continue;
			}
			int j=i+1;
			while(j<a.length)
			{
				if(total+a[j]<=k)
				{
					total+=a[j];
				}
				else if(total==k){
					if(maxCount<(j-i+1))
					{
						maxCount=j-i;
					}
					break;
				}
				else {
					break;
				}
				j++;
			}
			if(total==k && maxCount<j-i+1)
			{
				maxCount=j-i;				
			}
			i++;
		}
		return maxCount;
	}
	
	public static int longestSubarrayWithSumKkol(int[] a, long k) {
		// Write your code here
		int maxLength=0;
		return maxLength;
	}
}
