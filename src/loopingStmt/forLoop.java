package loopingStmt;

public class forLoop {
	
	public static void total_no_of_digi(int n) {
		
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
			System.out.println(count);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		total_no_of_digi(12345);
		
		int i,j,a=10,b=20;
		
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("------------------------");
		
		// 3tables
		for(j=1;j<=10;j++) {
			System.out.println(j+"x"+"3"+"="+j*3);
		}
		System.out.println("-------------------------");
		//Swapping two int variable without using 3rd variable
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);

	}
}
