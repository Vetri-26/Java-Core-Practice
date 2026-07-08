package ArrayProgram;

public class copyingArray {
	
	public static int[] copyingArray(int [] arr) {
		int[] copy=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			copy[i]=arr[i];
		}
		return copy;
	}
	
	
	
public static void copyingArrayRe(int [] arr) {
		
		for(int i=arr.length;i>0;i--) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		int [] array= {12,13,14,15};
		System.out.println(copyingArray(array));
//		copyingArrayRe(array);
	}
}
