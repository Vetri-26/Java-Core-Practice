package bubbleSort;

import java.util.Arrays;

public class selectionSorting {

	public static void selectionSort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}

	}

	public static void insertion_sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

	}

	public static void main(String[] args) {
		int[] a = { 5, 8, -7, 94, 23, 43, 21, 1, 2 - 88 };

//		selectionSort(a);
		insertion_sort(a);

		System.out.println(Arrays.toString(a));

	}
}
