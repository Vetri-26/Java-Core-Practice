package problems;

public class sumOfNum {
	// Sum of numbers
	public static void sumOfNumber(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println(sum);

	}

	// reverse of given number
	public static void reverseOfNumber(int n) {
		int res = 0;
		while (n != 0) {
			res = res * 10 + n % 10;
			n /= 10;
		}
		System.out.println(res);

	}

// factorial of given number
	public static void factorialOfNumber(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++)
			res = res * i;

		System.out.println(res);

	}

// prime number
	public static boolean primeNumber(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	// Fibonoci
	public static void Fibono(int n) {
		int a = 0;
		int b = 1;

		for (int i = 1; i <= n; ++i) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(a);
			System.out.println();
		}

	}

//	Armstrong no in range
	public static void armstrongNo_range(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (armstrongNo(i)) {
				System.out.println(i);
			}
		}
	}

//Armstrong number
	public static boolean armstrongNo(int num) {
		int temp = num;
		int digit = 0;
		while (temp != 0) {
			temp /= 10;
			digit++;
		}
		System.out.println(digit);

		int sum = 0;
		int power = 1;
		while (temp != 0) {
			int lg = temp % 10;
			for (int i = 1; i <= digit; i++) {
				power *= lg;
			}
			sum = power;
			System.out.println(sum);

		}
		return sum == num;
	}

//	reverse of second half
	public static void revSecHalf(int num) {
		int temp = num;
		int digit = 0;
		while (temp != 0) {
			temp /= 10;
			digit++;
		}
		System.out.println(digit);

		int a = digit / 2;
//		System.out.println(a);

		int power = 1000;
		int fh = num / power;
		int sh = num % power;
		int rev = 1;

		while (sh != 0) {
			rev = rev * 10 + sh;
			rev /= 10;
		}

//		System.out.println(sh);
		System.out.println(rev);

	}

//	Sum of digits o/p=single digit
	public static void sumOfDigit(int n) {
		int sum = 0;
		while (n > 9) {
			sum = 0;
			while (n != 0) {

				sum += n % 10;
				n /= 10;
//				System.out.println(sum);
			}
			n = sum;
		}
		System.out.println(sum);

	}

// swap digits imediate next
	public static void swapDigit(int num) {
//		method 1:
//			int power=10000;
//			int fh=num/power;
//			System.out.println(fh);

		int multiplier = 1;
		int result = 0;
		while (num != 0) {
			int ld = num % 10;
			num /= 10;

			int sld = num % 10;
			num /= 10;

			result = multiplier * (ld * 10 + sld) + result;
			multiplier *= 100;

		}
		System.out.print(result);

	}

//		System.out.println(fh);

//Main method 
	public static void main(String[] args) {
//		sumOfNumber(11111);
//		reverseOfNumber(12345);
//		factorialOfNumber(5);
//
//		System.out.println(primeNumber(14));
//		Fibono(10);
//		System.out.println(armstrongNo(153));
//		revSecHalf(123456);
//		sumOfDigit(673);
		swapDigit(123456);

	}
}
