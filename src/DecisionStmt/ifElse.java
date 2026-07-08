package DecisionStmt;

import java.util.Scanner;
public class ifElse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value a: ");
		int a=sc.nextInt();
		System.out.println("Enter a value b: ");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("A is greater");
		}
		else {
			System.out.println("B is greater");
		}
	}
}