package has_A;

public class Sim {

	private long num;

	
	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		long temp=num;
		
		int count=0;
		
		while(temp!=0) {
			temp/=10;
			count++;
		}
		if(count==10) {
			this.num = num;
		}else {
			System.out.println("Enter a valid number");
		}
		
		
		this.num = num;
	}
}
