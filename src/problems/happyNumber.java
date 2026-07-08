package problems;

public class happyNumber {

	public static boolean isHappyNumber(int num) {
		while(num!=1&&num!=4) {
			num=sqSum(num);
		}
		return num==1;
	}
	
	public static int sqSum(int num) {
		int sum=0;
		while(num!=0) {
			int d=num%10;
			sum+=d*d;
			num/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isHappyNumber(20));
		
	}
	
	
}
