package collection;

public class Students1 implements Comparable<Students1> {

	private String name;
	private int id;
	private int age;

	public Students1(String name, int id, int age) {
		// TODO Auto-generated constructor stub

		this.name=name;
		this.id=id;
		this.age=age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Students1 [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	//	 @Override
	public int compareTo(Students1  stu2) {
		return this.getName().compareTo(stu2.getName());
		//	    
		/*	@Override
	public int compareTo(Students1 stu2) {
		// TODO Auto-generated method stub

		if(this.getId()>stu2.getId())
			return 1;
		else
			return -1;


		if(this.getAge()>stu2.getAge())
			return 1;
		else
			return -1;

	}
}*/

	}

}


