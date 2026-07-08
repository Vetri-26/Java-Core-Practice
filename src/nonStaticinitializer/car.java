package nonStaticinitializer;

public class car {

	String brand;
	String color;
	String model;

	int varient = getVarient();
	int volks = getVolksWagon();

	public int getVarient() {
		System.out.println("Mid varient ");
		return 2;
	}

	{
		System.out.println("Mahindra");
	}
	{
		System.out.println("7X0");
	}
	{
		System.out.println("blue color");
		System.out.println("--------------------------");
	}

	public int getVolksWagon() {
		System.out.println("VolksWagon");
		System.out.println("Virtus");
		System.out.println("Gold");
		System.out.println("Price:12L");
		return 1;
	}

	car() {

	}

	public static void main(String[] args) {
		new car();
		new car();
		new car();
		new car();
		new car();

	}
}
