package problems;

public class checkIfPairWithGivenSumExists {
	public static boolean pairArray(int[] a, int k) {
		int i = 0, j = a.length - 1;

		while (i < j) {
			int sum = a[i] + a[j];
			if (sum == k) {
				return true;
			} else if (sum > k) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}
	
	
	
	
	
	

	public static int pairOf(int[] a, int k) {
		int i = 0, j = a.length - 1;
		int count = 0;

		while (i < j) {
			int sum = a[i] + a[j];
			if (sum < k) {
				count += j - i;
				i++;
			} else {
				j--;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };

//		System.out.println(pairArray(a, 6));
		System.out.println(pairOf(a, 7));
	}
}
