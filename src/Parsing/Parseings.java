package Parsing;

public class Parseings {
	public static void main(String[]args) {
		String s="123";
		int a=Integer.parseInt(s);
		System.out.println(s);
		
		
		String b="True";
		boolean c=Boolean.parseBoolean(b);
		System.out.println(c);
		
		boolean d=true;
		String d1=String.valueOf(d);
		System.out.println(d1);
		
//		String Formatting
		String b2="1100";
		int i1=Integer.parseInt(b2,2);
		System.out.println(i1);
		
		String b3="4562";
		int i2=Integer.parseInt(b3,8);
		System.out.println(i2);
		
	}
}
