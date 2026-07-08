package has_A;

public class customer_ {

	public static void main(String[] args) {
		car c = new car();

		c.setBrand("VolksWagon");

		System.out.println(c.getBrand());

		c.setEngineCc(21);
		c.setEngineMilage(19.3);
		c.setEngineType("Petrol");

		System.out.println(c.getEngine().getCc());
		System.out.println(c.getEngine().getMilage());
		System.out.println(c.getEngine().getType());

		
		
	}

}
