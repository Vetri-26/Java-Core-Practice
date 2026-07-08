package encapsulation;

public class internetBank {

	int UserID;
	String password;
	int transaction_limit;
	double balance = 200000.0;
	double WithdrawPerDay = 1000000.0;
	double WithDrawing;

	public int getUserID() {
		return this.UserID;
	}

	public void setUserID(int UserID) {
		if (UserID > 0) {
			int temp = UserID;

			int count;
			for (count = 0; temp != 0; ++count) {
				temp /= 10;
			}

			if (count == 6) {
				this.UserID = UserID;
			} else {
				System.err.println(
						"The User ID should be in the length of 6 , So We have assigned you the default value");
			}
		} else {
			System.err.println("The User ID should not be in negative, So We have assigned you the default value");
		}

	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getWithDrawing() {
		return this.transaction_limit;
	}

	public void setWithDrawing(int WithDrawing) {
		if (this.balance >= (double) WithDrawing) {
			System.out.println("Please Wait for the cash !!!!");
			this.WithDrawing = (double) WithDrawing;
		} else {
			System.err.println("Insufficient Balance");
		}

	}
}
