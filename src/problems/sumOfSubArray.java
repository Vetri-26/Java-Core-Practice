package problems;

import java.util.Arrays;

public class sumOfSubArray {

	public static int[] sumOfSubArray(int[] a, int k) {
		int n = a.length;
		int[] res = new int[n - k + 1];

		// default window
		int windowsum = 0;
		for (int i = 0; i < k; i++) {
			windowsum += a[i];
		}
		res[0] = windowsum;
		
		for(int i=1;i<=n-k;i++) {
			windowsum=windowsum-a[i-1]+a[i+k-1];
			res[i]=windowsum;
		}
		return res;
		
	}

	public static void main(String[] args) {
		int a[] = { 2, 1, 5, 1, 3, 2 };
		int res[]=sumOfSubArray(a,3);
		System.out.println(Arrays.toString(res));
	}
}
