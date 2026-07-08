package encapsulation;

public class mobile {

	private long iemiNumber;
	private int batteryPercentage;
	private String password;

//	Getter for IEMI number
	public long getIemiNumber() {
		return iemiNumber;
	}

//	Setter for IEMI number	
	public void setIemiNumber(long iemiNumber) {

		int count = 0;
		long temp = iemiNumber;
		while (iemiNumber != 0) {
			iemiNumber /= 10;
			count++;
		}
		if (count == 15) {
			this.iemiNumber = temp;
		} else {
			System.err.println("You entered invalid number so it becomes 0");

		}

	}

//	Getter for BatteryPercentage
	public int getBatteryPercentage() {
		return batteryPercentage;
	}

//	Setter for BatteryPercentage	
	public void setBatteryPercentage(int batteryPercentage) {
		if (batteryPercentage < 100 && batteryPercentage > 0) {
			this.batteryPercentage = batteryPercentage;
		}else {
			System.err.println("You entered invalid number so it becomes 0");
		}
	}

//	Getter for password
	public String getPassword() {
		return password;
	}

//	Setter for password
	public void setPassword(String password) {
		this.password = password;
	}

}
