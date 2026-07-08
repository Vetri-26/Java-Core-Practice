package problems;

public class moveArrayElements {

	public static void moveElements(int[] a, int k) {
		
		int i=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]!=k) {
				a[i++]
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		moveElements(a, 30);
	}
}
