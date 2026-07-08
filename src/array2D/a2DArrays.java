package array2D;

public class a2DArrays {
	public static void transposeArray(int[][] a) {
		int trans[][] = new int[a[0].length][a.length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				trans[j][i] = a[i][j];
			}
		}
		for (int i = 0; i < trans.length; i++) {
			for (int j = 0; j < trans[i].length; j++) {
				System.out.print(trans[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void sumOfAllElements(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}

		}
		System.out.println(sum);
	}

	public static void largestValueInEachRow(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			int lg = a[i][0];
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > lg) {
					lg = a[i][j];
				}

			}
			System.out.println(lg);
		}

	}

	public static void sumOfColumnElements(int[][] a) {

		for (int j = 0; j < a[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum += a[i][j];
			}
			System.out.println(sum);
		}

	}

	public static void sumOfDiagonalElements(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i][i];
		}
		System.out.println(sum);
	}

	public static boolean checkIndentityMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j && a[i][j] != 1 || i != j && a[i][j] != 0) {
					return false;
				}
			}

		}
		return true;

	}

	public static boolean checkSymetricMatrix(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != a[j][i]) {
					return false;
				}

			}

		}
		return true;
	}

	public static int linearSearch(int[] a) {
		int target = 5;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				return i;
			}

		}
		return -1;
	}

//	public static int lastOccurrence(int[] a) {
//
//	}

	public static int firstOccurrenceUsingBinarySearch(int[] nums) {

		int target = 5;
		int start = 0;
		int end = nums.length - 1;
		int result = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == nums[mid]) {
				result = mid;
				end = mid--;
				
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int[][] sym = { { 1, 2, 3 }, { 2, 5, 6 }, { 3, 6, 9 } };

		int[] num = { 1, 2, 3, 3, 5, 5, 9 };

//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
//		transposeArray(a);
//		sumOfAllElements(a);
//		largestValueInEachRow(a);
//		sumOfColumnElements(a);
//		sumOfDiagonalElements(a);

//		System.out.println(checkIndentityMatrix(b));
//		System.out.println(checkSymetricMatrix(sym));
//		System.out.println(linearSearch(num));
//		System.out.println(lastOccurrence(num));
		System.out.println(firstOccurrenceUsingBinarySearch(num));
	}

}
