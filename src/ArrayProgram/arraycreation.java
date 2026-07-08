package ArrayProgram;

import java.util.Scanner;

public class arraycreation {

	// Generate sequence
	public static int[] generateSeqence(int n) {

		int[] arr2 = new int[n];
		for (int index = 1, a = 1; index <= arr2.length; index++, a++) {
			arr2[index] = a * a;
		}
		return arr2;
	}

	public static void arrayInputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element " + (i + 1) + ":");
			arr[i] = sc.nextInt();
		}

		System.out.println("The all array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

//		Reverse Array
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4 };

//		Method Calling
		int arr[] = generateSeqence(3);
		System.out.println(arr);
//		arrayInputs();
	}
}
