package DecisionStmt;

public class quadraticEquation {
	public static void main(String[] args) {
		int a= 3;
		int b= 2;
		int c= 1
				; 
		
		int dis=(b*b)-4*a*c;
		
		System.out.println(dis);
		
		if(dis>0) {
			System.out.println("Roots of real and discreminant");
			System.out.println((-b+Math.sqrt(dis))/2*a);
			System.out.println((-b-Math.sqrt(dis))/2*a);
		}
		else if(dis==0) {
			System.out.println("Roots of real and equal");
			System.out.println((-b+Math.sqrt(dis))/2*a);
					
		}
		else {
			System.out.println("Roots of imaginary");
			System.out.println((-b/2*a)+"+"+Math.sqrt(Math.abs(dis))/2*a+"i");
			System.out.println((-b/2*a)+"-"+Math.sqrt(Math.abs(dis))/2*a+"i");

		}
			
		}
		
	}

