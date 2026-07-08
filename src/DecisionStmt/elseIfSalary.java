package DecisionStmt;

import java.util.Scanner;
public class elseIfSalary {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your Gender:");
			String gender=sc.next();
			
			System.out.println("Enter your Experience:");
			int expe =sc.nextInt();
			
			System.out.println("Enter your Qualification:");
			String qual=sc.next();
			
			//Male
			if(gender.equals("male") && expe>=10 && qual.equals("PG")) {
				System.out.println("15000");
			}
			else if(gender.equals("male") && expe>=10 && qual.equals("UG")) {
				System.out.println("10000");
			}
			else if(gender.equals("male") && expe<10 && qual.equals("PG")) {
				System.out.println("10000");
			}
			else if(gender.equals("male") && expe<10 && qual.equals("UG")) {
				System.out.println("7000");
			}
			
			//Female
			if(gender.equals("female") && expe>=10 && qual.equals("PG")) {
				System.out.println("12000");
			}
			else if(gender.equals("female") && expe>=10 && qual.equals("UG")) {
				System.out.println("9000");
			}
			else if(gender.equals("female") && expe<10 && qual.equals("PG")) {
				System.out.println("8000");
			}
			else if(gender.equals("female") && expe<10 && qual.equals("UG")) {
				System.out.println("6000");
			}
			
		}
}
