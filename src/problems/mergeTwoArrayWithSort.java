package problems;
import java.util.Arrays;

public class mergeTwoArrayWithSort {

	public static int[] mergeSortArray(int[] a1, int[] a2) {

		int[] merge = new int[a1.length + a2.length];

		int i = 0, j = 0, k = 0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				merge[k] = a1[i];
				k++;
				i++;
			} else {
				merge[k] = a2[j];
				k++;
				j++;
			}
		}
		while (i < a1.length) {
			merge[k] = a1[i];
			k++;
			i++;
		}
		while (j < a2.length) {
			merge[k] = a2[j];
			k++;
			j++;
		}
		return merge;
	}

	public static void main(String[] args) {

		int[] a1 = { 1, 3, 4 };
		int[] a2 = { 2, 5, 6 };

		System.out.println(Arrays.toString(mergeSortArray(a1, a2)));

	}
}
