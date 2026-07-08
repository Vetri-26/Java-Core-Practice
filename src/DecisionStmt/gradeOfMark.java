package DecisionStmt;

public class gradeOfMark {

	public void usingElseIf() {
		int tamil = 90, eng = 80, math = 96, chemi = 95, physic = 92;

		double avrg = ((tamil + eng + math + chemi + physic) / 500.0) * 100;
		System.out.println(avrg + "%");

		if (avrg >= 90) {
			System.out.println("Grade is A");
		} else if (avrg >= 80) {
			System.out.println("Grade is B");

		} else if (avrg >= 70) {
			System.out.println("Grade is C");

		} else if (avrg >= 60) {
			System.out.println("Grade is D");

		} else if (avrg >= 50) {
			System.out.println("Grade is E");

		} else {
			System.out.println("Fail ");

		}
	}

	public void usingSwitch() {
		int tamil = 70, eng = 60, math = 66, chemi = 75, physic = 82;

		double avrg = ((tamil + eng + math + chemi + physic) / 500.0) * 100;
		System.out.println(avrg + "%");
		
		switch((int)avrg/10) {
		case 9:System.out.println("Grade is A");
		break;
		case 8:System.out.println("Grade is B");
		break;
		case 7:System.out.println("Grade is C");
		break;
		case 6:System.out.println("Grade is D");
		break;
		case 5:System.out.println("Grade is E");
		break;
		case 4:System.out.println("Fail");
		break;
		
		}
	}

	public static void main(String[] args) {

		new gradeOfMark().usingElseIf();
		new gradeOfMark().usingSwitch();		
	}
}
