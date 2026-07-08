package encapsulation;

public class electricityBill {
	private double UnitsConsumed;
	private double charges;

	public double getUnitsConsumed() {
		return this.UnitsConsumed;
	}

	public void setUnitsConsumed(double UnitsConsumed) {
		if (UnitsConsumed >= 0.0) {
			this.UnitsConsumed = UnitsConsumed;
		} else {
			System.err.println("Invalid Units Cosumed so Default value become 0");
		}

	}

	public double getCharges() {
		return this.charges;
	}

	public void setCharges(double charges) {
		charges = this.UnitsConsumed * charges;
		this.charges = charges;
	}
}
