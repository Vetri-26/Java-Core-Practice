package has_A;

public class engine {

	private int cc;
	private double milage;
	private String type;

	public engine() {

	}

	public engine(int cc) {
		this.cc=cc;
	}
	public engine(int cc,double milage) {
		this(cc);
		this.milage=milage;
	}
	public engine(int cc,double milage,String type) {
		this(cc,milage);
		this.type=type;
	}
	
	

	
	
	
	
	public int getCc() {
		return cc;
	}

	public double getMilage() {
		return milage;
	}

	public String getType() {
		return type;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public void setType(String type) {
		this.type = type;
	}

}
