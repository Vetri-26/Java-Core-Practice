package object;

public class noArgsConstructor {

	
	noArgsConstructor(){
		System.out.println("Good Morning");
	}
	
	public static void main(String[] args) {
		new noArgsConstructor();//Object creation and calling
		new noArgsConstructor();//Object creation and calling
		new noArgsConstructor();//Object creation and calling
		new noArgsConstructor(); //Object creation and calling 
	}
}
