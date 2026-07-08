package java_1;

public class Student {
	public static void main(String[] args) {
		info("Vetri");
		info("Vetri",20);
		info("Vetri",20,87.5);
		
	}
	public static void info(String name) {
		System.out.println("Name:"+name);
	}
	public static void info(String name,int age) {
		System.out.println("Name:"+name+" Age:"+age);
	}
	public static void info(String name,int age,double marks) {
		System.out.println("Name:"+name+" Age:"+age+" Marks:"+marks);
	}
	
}
