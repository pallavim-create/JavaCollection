package collection;

public class Stu {
	public String name;
	public int age;
	public  String subject;
	
	
	public Stu(String name,int age,String subject) {
		this.name=name;
		this.age=age;
		this.subject=subject;
		
	} 
	
	public void display() {
		System.out.println(name+" "+age+" "+subject+"");
	}

}
