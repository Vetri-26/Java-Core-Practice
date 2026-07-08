package encapsulation;

public class bankAccountCalling {

	public static void main(String[] args) {
		bankAccount ba = new bankAccount();

		ba.deposit(100);
		ba.withdraw(50);
		
	 System.out.println("Balance Amount: "+ba.checkBalance());

	}
}
