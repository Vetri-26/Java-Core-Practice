package has_A;

public class Battery {

	private int mah;

	public int getMah() {
		return mah;
	}

	public void setMah(int mah) {
		if (mah > 0) {
			this.mah = mah;
		}
	}

	Battery(int mah) {
		setMah(mah);
	}
}
