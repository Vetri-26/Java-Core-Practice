package problems;

public class AvgGreaterThanX {

	public static int avgGreatThanX(int[] a, int k, int x) {
		int n = a.length;
		int count = 0;

		// Default window
		int windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum += a[i];
		}
		int avg = windowSum / k;
		if (avg >= x) {
			count++;
		}

		for (int i = 1; i < n - k + 1; i++) {
			windowSum = windowSum - a[i + 1] + a[i + k - 1];
			avg = windowSum / k;
			if (avg >= x) {
				count++;
			}

		}
		return count;

	}

	public static int maxEvenCount(int[] a, int k) {

		int n = a.length;
		int count = 0;
		// Default window

		for (int i = 0; i < k; i++) {

			if (a[i] % 2 == 0) {
				count++;
			}
		}

		int maxEvenCount = count;

//		Slide window
		for (int i = 1; i < n - k + 1; i++) {
			if (a[i - 1] % 2 == 0) {
				count--;
			}
			if (a[i + k - 1] % 2 == 0) {
				count++;
			}
			if (count > maxEvenCount) {
				maxEvenCount = count;
			}
		}
		return maxEvenCount;
	}

	public static int sumOfSmallestSubArray(int[] a, int sum) {

		int n = a.length;
		int windowSum = 0;
		int start = 0;
		int minSubLength = n + 1;

		for (int end = 0; end < n; end++) {
			windowSum += a[end];

			while (windowSum >= sum) {
				int length = end - start + 1;
				if (length < minSubLength) {
					minSubLength = length;
				}
				windowSum -= a[start];
				start++;
			}
		}
		return (minSubLength == n + 1) ? 0 : minSubLength;
	}

	public static int longestSubArray(int[] a, int s) {

		int n = a.length;
		int longestSubArray = 0;

		int windowSum = 0;
		int start = 0;
		for (int end = 0; end < n; end++) {
			windowSum += a[end];

			while (windowSum > s) {
				windowSum -= a[start];
				start++;
			}

			int length = end - start + 1;
			if (length > longestSubArray) {
				longestSubArray = length;
			}

		}
		return longestSubArray;

	}

	public static void main(String[] args) {

//		int[] a = { 2, 1, 5, 1, 3, 2 };
//		System.out.println(avgGreatThanX(a,3,3));

//		int[] a = { 2, 3, 4, 6, 5, 8, 1 };
//		System.out.println(maxEvenCount(a, 3));

//		int[] b = { 2, 1, 5, 2, 3, 2 };
//		System.out.println(sumOfSmallestSubArray(b, 7));
		
		int[]b= {};
		System.out.println(sumOfSmallestSubArray(b));
	}
}
