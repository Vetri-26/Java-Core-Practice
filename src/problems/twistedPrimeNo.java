package problems;

public class twistedPrimeNo {
//Checking Prime 
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 2) {
				return false;
			}
		}
		return true;

	}

//	Reversing
	public static int reverse(int n) {
		int reverse = 0;
		while (n > 0) {
			reverse = (reverse * 10 + (n % 10));
			n /= 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(13));

		if (isPrime(13) && isPrime(reverse(13))) {
			System.out.println("twisted Prime");
		} else {
			System.out.println("Not twisted prime");
		}
	}
}
