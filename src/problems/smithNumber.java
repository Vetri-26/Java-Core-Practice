package problems;

public class smithNumber {

	public static boolean smithNo(int num) {
		
		if(isPrime(num)) return false;
		
		int temp
	}

	public static boolean isPrime(int p) {
		if (p < 2) {
			return false;
		}

		for (int i = 2; i <= p / 2; i++) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void sumOfDigits(int num) {
		
	}

	public static void main(String[] args) {

	}
}
