package String;

import java.util.Arrays;

public class StringBuff {
	public static int countConsonent(String str) {

		int count = 0;
		String vowels = "aeiouAEIOU";

		for (int i = 0; i < str.length() - 1; i++) {
			char h = str.charAt(i);

		}

		return count;
	}

	public static boolean checkPalindrome(String str) {

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println(rev);
//		str1=str.reverse();
//		if(str==str1) {
//			System.out.println("Its is palindrome");
//			return true;
//		}

		return str.equals(rev);
	}

	public static void reverseEachWord(String str) {
		String[] arr = str.split(" ");
		String rev = "";
		for (String word : arr) {

			for (int i = word.length() - 1; i >= 0; i--) {
				rev += word.charAt(i);

			}
			rev += " ";
		}
		System.out.println(rev);
	}

	public static void freqOfChar(String str) {

		int[] freq = new int[26];

		for (char ch : str.toCharArray()) {
			freq[ch - 'a']++;

		}
		for (char ch : str.toCharArray()) {
			if (freq[ch - 'a'] != 0) {
				System.out.println(ch + " : " + freq[ch - 'a']);
				freq[ch - 'a'] = 0;
			}

		}
//		System.out.println(Arrays.toString(freq));
	}

	public static void firstNonRepeatingChar(String str) {

		int[] freq = new int[26];

		for (char ch : str.toCharArray()) {
			freq[ch - 'a']++;

		}
		for (char ch : str.toCharArray()) {
			if (freq[ch - 'a'] == 1) {
				System.out.println(ch);
				//freq[ch - 'a'] = 0; 
				break;
				
			}
		}

		}
		
		public static void firstRepeatingChar(String str) {

			int[] freq = new int[26];

			for (char ch : str.toCharArray()) {
				freq[ch - 'a']++;

			}
			for (char ch : str.toCharArray()) {
				if (freq[ch - 'a'] > 1) {
					System.out.println(ch + " : " + freq[ch - 'a']);
					freq[ch - 'a'] = 0;
					break;
				}

			}

	}

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer();

//		System.out.println(str.capacity());
//		str.append("hello");
//		System.out.println(str.length());
//		str.append("A A A A AAAAAAAAA");
//		System.out.println(str.capacity());
//		System.out.println(str.length());
//		str.append("B");
//		System.out.println(str.capacity());

//		System.out.println(checkPalindrome("malayalam"));
//		reverseEachWord("java vetri");
//		freqOfChar("programming");
//		firstNonRepeatingChar("programming");
		firstRepeatingChar("programming");

	}
}
