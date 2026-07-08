package Boxing;

public class AutoBoxing {

	public static void AutoBoxing(){
		int a=10;
		Integer a1=Integer.valueOf(a);
		Integer a2=a;
		System.out.println(a1);
		System.out.println(a2);
	}
	
	public static void AutoUnBoxing() {
		Integer a=20;
		int a1=a.intValue();
		int a2=a;
		System.out.println(a1);
		System.out.println(a2);
	}
	
	public static void Typecast() {
		Integer b=10;
		Short b1=(Integer)b;
	}
	
	public static void  main(String[]args) {
		AutoBoxing();
		AutoUnBoxing();
		Typecast();
		
	}
	
}
