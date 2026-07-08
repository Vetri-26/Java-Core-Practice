package encapsulation;

public class bankAccount {

	private double balance;

//	Getter for balance
//	public double getBalance() {
//		return balance;
//	}
//
////	Setter for balance
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}

	public double deposit(double deposit) {
		if (deposit >= 0) {
			balance += deposit;
			System.out.println("Amount Deposited: "+deposit);
			
		}else {
			System.err.println("You Entered invalid amount ");
		}
		return balance;

	}

	public double withdraw(double withdraw) {
		if (withdraw <= balance) {
			balance-=withdraw;
			System.out.println("ENJOY with your amount");
		}else {
			System.err.println("insufitiant balance");
		}
		
		return balance;
	}

	public double checkBalance() {
		return balance;
	}
}
