package PetternProgram;

public class patternProgram {

	public static void patternSquare(int num) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" @");
			}
			System.out.println();
		}
		
	}
	
public static void patternLL(int num) {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				if(i==1||i==5) {
					System.out.print("* ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
	}


public static void patternForwardslash(int num) {
	
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=5;j++) {
			if(i==j) {
				System.out.print("* ");
			}else {
				System.out.print("   ");
			}
		}
		System.out.println();
	}
	
}

public static void patternBackwardslash(int num) {
	
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=5;j++) {
			if(i+j==num+1) {
				System.out.print("*");
			}else {
				System.out.print("   ");
			}
		}
		System.out.println();
	}
	
}

public static void patternX(int num) {
	
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=5;j++) {
			if(i+j==num+1||i==j||i==1||i==5||j==1||j==5) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
}

public static void patternZ(int num) {
	
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=5;j++) {
			if(i+j==num+1||i==1||i==5) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
}


public static void patternN(int num) {
	
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=5;j++) {
			if(j==i||j==1||j==5) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
}

public static void patternMenu(int num) {
	
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=5;j++) {
			if(i==1||i==5||j==1||j==5) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
}

public static void patternTriangle(int num) {
	
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=5;j++) {
			if(i<=j) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
}
	
	
	public static void main(String[] args) {
//		patternSquare(1);
//		patternLL(5);
//		patternForwardslash(5);
//		patternBackwardslash(5);
//		patternX(5);
//		patternZ(5);
//		patternN(5);
//		patternMenu(5);
		patternTriangle(5);
	}
}
