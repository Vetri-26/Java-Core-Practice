package object;

public class objects {

	String name;
	int id;

	public static void main(String[] args) {

		objects s1 = new objects();
		objects s2 = new objects();
	

//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s2==s3);

		s1.name = "vetri";
		s1.id = 100;

		objects s3 = s1;
		s3.name="King";
		System.out.println(s1.name);
		
	

	}
}
