package has_A;

public class car {

	private engine e = new engine();

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public engine getEngine() {
		return e;
	}

	public void setEngine(engine engine) {
		this.e = engine;
	}

	
	
	public void setEngineCc(int cc) {
		e.setCc(cc);
	}
	public void setEngineMilage(double milage) {
		e.setMilage(milage);
	}
	public void setEngineType(String type) {
		e.setType(type);
	}

}
