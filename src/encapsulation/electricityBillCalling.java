package encapsulation;

public class electricityBillCalling {

	public static void main(String[] args) {
		electricityBill eBl = new electricityBill();
		eBl.setUnitsConsumed(2525.0);
		eBl.setCharges(50.0);
		System.out.println("Electricity consumed :" + eBl.getUnitsConsumed());
		System.out.println("Charges of Electricity consumed :" + eBl.getCharges());
	}
}
