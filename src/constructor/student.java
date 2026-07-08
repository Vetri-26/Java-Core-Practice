package constructor;

public class student {

	String name;
	int id;
	int rollNo;
	int marks;
	char grade;
	long contact_Number;

	public void study() {
		System.out.println("study");
	}

	public void eating() {
		System.out.println("eating");
	}

	public void sleeping() {
		System.out.println("sleeping");
	}

	public void programming() {
		System.out.println("programming");
	}
	
	
	
	
	
	student(){
		
	}
	
	student(String name){
		this();
		this.name=name;
	}
	student(String name,int id){
		this(name);
		this.id=id;
	}
	student(String name,int id,int rollNo){
		this(name,id);
		this.rollNo=rollNo;
	}
	student(String name,int id,int rollNo,int marks){
		this(name,id,rollNo);
		this.marks=marks;
	}
	student(String name,int id,int rollNo,int marks,char grade){
		this(name,id,rollNo,marks);
		this.grade=grade;
	}
	student(String name,int id,int rollNo,int marks,char grade,long contact_Number){
		this(name,id,rollNo,marks,grade);
		this.contact_Number=contact_Number;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		student st=new student("vetri",21,216,84,'A',934490029);
		
		
		System.out.println(st.name);
		System.out.println(st.id);
		System.out.println(st.rollNo);
		System.out.println(st.marks);
		System.out.println(st.grade);
		System.out.println(st.contact_Number);
	}

}
