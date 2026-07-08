package bubbleSort;
import java.util.Arrays;

public class bubbleSorting {

	public static void main(String[] args) {
		int [] arr= {5,8,-7,94,23,43,21,1,2-88};
		bubble_sorting(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubble_sorting(int[] a) {
		
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
	
}
