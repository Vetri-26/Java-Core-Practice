package DecisionStmt;

import java.util.Scanner;
public class alphaVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet:");
		char alpha=sc.next().charAt(0);
		
		if(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u') {
		System.out.println(alpha+" It is vowel");
		
	}
		else {
			System.out.println(alpha+" It is not vowel");
		}

	}
}
