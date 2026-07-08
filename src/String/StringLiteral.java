package String;


public class StringLiteral {

	public static void StringL() {
		String name1="Vetri";
		String name2="Vetri";
		
		System.out.println(name1==name2);
	}
	public static void LearnString() {
		String name1="Vetri";
		String name2=new String("Vetri");
		
		System.out.println(name1==name2);
		
		System.out.println(name2.toString());
		System.out.println(name1.equals(name2));
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
	}
	
	
	
	public static void main(String []args ) {

//		String s1="Hello";
//		String s2="Hi";
//		String s3 = s2;
//		s1 = s3;
//		System.out.println(s1=="Hi");
//		
//		StringL();
		LearnString();
	
	}
}


