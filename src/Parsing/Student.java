package Parsing;


	class Stud{
	    int id;
	    String name;

	    Stud(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public boolean equals(Object obj) {
	        Stud s = (Stud) obj;
	        return this.id == s.id;
	    }
	}

	public class Student {
	    public static void main(String[] args) {

	        Stud s1 = new Stud(101, "Rahul");
	        Stud s2 = new Stud(102, "Amit");

	        if (s1.equals(s2))
	            System.out.println("Students are equal");
	        else
	            System.out.println("Students are not equal");
	    }
	}
