package array2D;

import java.util.Scanner;
import java.util.Arrays;

public class array2D {
	public static void jagedArray() {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 2, 2 }, { 7, 8, 9, 3, 4, 3, 4 }, { 1, 2, 3 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void dynamicArray() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the No of Rows");

		int[][] arr = new int[sc.nextInt()][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the size of the Array:" + (i + 1));
			int[] temp = new int[sc.nextInt()];

			for (int j = 0; j < temp.length; j++) {
				System.out.print("Enter the Value of arry:");
				temp[j] = sc.nextInt();

			}
			arr[i] = temp;

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
	}

	public static int[][] addOf2dArray() {
		int[][] a = { { 1, 2 }, { 3, 4 } };
		int[][] b = { { 1, 2 }, { 3, 4 } };

		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				 res[i][j] = a[i][j]+b[i][j];
				
			}
			System.out.println();
		}
		return res;

	}

	public static void main(String[] args) {

//		Normal Array
//		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}

//		Method Calling
//		jagedArray();
//		dynamicArray();
//		System.out.println(addOf2dArray());
	}
}
