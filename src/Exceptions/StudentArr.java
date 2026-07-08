package Exceptions;

public class StudentArr {

	private int id;
	private String name;
	private int age;
	private int MobNo;

	

	public StudentArr(int id, String name, int age, int mobNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		MobNo = mobNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMobNo() {
		return MobNo;
	}

	public void setMobNo(int mobNo) {
		MobNo = mobNo;
	}

}

//Second Class

class Driver{
	public static void  main(String []args) {
		StudentArr [] students=new StudentArr[5];
		
		students[0]=new StudentArr(1,"vetri",20,123456);
		students[2]=new StudentArr(2,"hari",21,123456);
		students[3]=new StudentArr(3,"hariharan",22,123456);
		students[4]=new StudentArr(4,"vicky",23,123456);
		students[5]=new StudentArr(5,"dom",24,123456);
		
		int key=3;
		StudentArr std=null;
		for(StudentArr s:students) {
			if(s.getId()==3) {
				std=s;
			}
		}
	}
	
	
	
}
