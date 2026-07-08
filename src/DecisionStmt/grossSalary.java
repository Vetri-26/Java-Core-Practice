package DecisionStmt;

public class grossSalary {

	public static void main(String[] args) {
		double salary = 25000;
		int joinYear = 2005;
		int currentYear = 2009;

		if (salary <= 10000) {

			System.out.println((salary * 0.20) + (salary * 0.80));
		}
		else if(salary <= 20000) {

			System.out.println((salary * 0.25) + (salary * 0.90));
		}
		else if(salary>20000) {

			System.out.println((salary * 0.30) + (salary * 0.95));
		}
		
		
		int exp=currentYear-joinYear;
		if(exp>3) {
			System.out.println(salary+2500);
		}
		else {
			System.out.println(salary);
		}
	}
}
