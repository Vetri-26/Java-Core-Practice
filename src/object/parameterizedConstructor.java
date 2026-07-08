package object;

public class parameterizedConstructor {

	String name;
	int id;

	parameterizedConstructor(String n, int i) {
		name = n;
		id = i;
	}

	public static void main(String[] args) {
		parameterizedConstructor ob = new parameterizedConstructor("vetri", 216);
		
		System.out.println(ob.name);
		System.out.println(ob.id);
	}
}
