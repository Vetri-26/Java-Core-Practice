package problems;
import java.util.Arrays;


public class segregateArrayIntoEvenAndOdd {

	public static void segregate(int[] a) {
		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			while (start < end && a[start] % 2 == 0) {
				start++;
			}
			while (start < end && a[end] % 2 != 0) {
				end--;
			}
			if (start < end) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}

		}

	}

	public static void main(String[] args) {
		int[] a = { 12, 17, 70, 15, 22, 65, 21, 90 };
		segregate(a);
		System.out.println(Arrays.toString(a));
	}
}
