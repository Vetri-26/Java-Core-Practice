package DecisionStmt;

import java.util.Scanner;
public class totalNoOfNotes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount=sc.nextInt();
		
		int Note500=amount%500;
		int Note200=Note500%200;
		int Note100=Note200%100;
		int Note50=Note100%50;
		int Note20=Note50%20;
		int Note10=Note20%10;
		int total=Note500+Note200+Note100+Note50+Note20+Note10;
		System.out.println(total);
		
	}
	
}
