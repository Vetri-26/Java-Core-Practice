package bubbleSort;

import java.util.Arrays;

public class bubbleSortAndBinarySearch {

	public static void bubble_sorting(int[] a) {

		int n = a.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

	}

	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 5, 8, -7, 94, 23, 43, 21, 1, 2 - 88 };
		bubble_sorting(arr);
		System.out.println(Arrays.toString(arr));

		int res = binarySearch(arr, 21);
		
		System.out.println(res);
		
		if (res != -1) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}

}
