package DecisionStmt;

import java.util.Scanner;
public class elseIf2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		
		if(a%5==0&&a%11==0) {
			System.out.println(a+"it divisible 5 and 11");
			
		}else {
			System.out.println("it is zero");
		}
		}
	}

