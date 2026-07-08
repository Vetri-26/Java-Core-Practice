package Exceptions;

public class ShadhiDotCom {

	public static void submit(int age) {
		if (age <= 18) {
			throw new InvalidAgeException("You are under age");
			System.out.println("welcome to shaadi dot com");
		}
	}
	
	public static void main(String[]args) {
		try {
			submit(17);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
