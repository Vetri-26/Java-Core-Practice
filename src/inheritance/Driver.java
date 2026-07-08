package inheritance;

//class A{
//int a=10;	
//}
//class D extends A{
//	int d
//}
//class B extends A{
//	
//}
//class C extends B{
//	
//}

class Cab {

}

class Sedan extends Cab {
	int price = 1233;
}

class Lux extends Cab {
	int price = 13422;
}

public class Driver {
	public static void main(String[] args) {
		Cab obj = new Sedan();
		Sedan s = (Sedan) obj;
		System.out.println(s.price);
		if (obj instanceof Lux) {
			Lux l = (Lux) obj;
			System.out.println(l.price);

		} else {
			System.out.println("unknown person is entering");
		}
	}
}
