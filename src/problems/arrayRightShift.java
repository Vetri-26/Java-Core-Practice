package problems;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRightShift {

	public static void rightShift(int[] a) {

		for (int i = a.length - 2; i >= 0; i--) {
			a[i + 1] = a[i];
		}
		a[0] = 0;

	}
	
	public static void rightShiftByn(int []a,int n) {
		
		for(int i=a.length-2;i>=0;i--){
			rightShift(a);
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		rightShift(a);
//		System.out.println(a);
//		printElements(a);
		System.out.println(Arrays.toString(a));
	}
}
