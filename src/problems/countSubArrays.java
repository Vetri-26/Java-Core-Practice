package problems;

public class countSubArrays {

	public static int countWin(int[] a, int k, int x) {
		int count = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=a[j];
				if(sum==k) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] a = { 2, 1, 5, 1, 3, 2 };

		System.out.println(countWin(a, 3, 3));
		

	}
}
