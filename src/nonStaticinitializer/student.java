package nonStaticinitializer;

import java.time.LocalDateTime;

public class student {

	String name;
	int id;
	int roll;

	{
		System.out.println(LocalDateTime.now());
		
	}
	
	student() {

	}

	student(String name){
		this();
		this.name = name;
	}

	student(String name,int id){
		this(name);
		this.id =id;
	} 
	student(String name,int id,int roll){
		this(name,id);
		this.roll =roll;
	}
	
	
	
	public static void main(String[] args) {
		new student();
		new student("Don",216,21);
		
	}

	
}
