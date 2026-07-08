package has_A;

public class Phone {

	private Sim sims = new Sim();

	private Battery batt = new Battery(6000);
	
	int index = 0;

	public void insertSim(int num) {
		if(index<2) {
		
		}
		
	}

	public Battery getBatt() {
		return batt;
	}

	public void setBatt(Battery batt) {
		this.batt = batt;
	}

}
