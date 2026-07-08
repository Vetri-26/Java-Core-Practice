package encapsulation;

public class mobileDetails {

	public static void main(String[] args) {
		mobile mb = new mobile();

		mb.setIemiNumber(123456789145699l);
		mb.setBatteryPercentage(21);
		mb.setPassword("vetrivel12");

		System.out.println("IEMI number is :"+mb.getIemiNumber());
		System.out.println("Battery per :"+mb.getBatteryPercentage()+"%");
		System.out.println("Password :"+mb.getPassword());
	}

}
