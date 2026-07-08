package DecisionStmt;

import java.util.Scanner;
public class elseIf {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A value:");
		int a=sc.nextInt();
		System.out.println("Enter the B value:");
		int b=sc.nextInt();
		if(a==b) {
			System.out.println("Both are equal");
			
		}
		else if(a>b) {
			System.out.println("A greater than B: "+a);
		}
		else {
			System.out.println("B greater than A: "+b);
		}
		}
}
