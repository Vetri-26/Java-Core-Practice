package loopingStmt;

import java.util.Scanner;
public class doWhileLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			System.out.println("Welcome");
			System.out.println("Do you want to  print again");
			ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y'); 
	}
}
