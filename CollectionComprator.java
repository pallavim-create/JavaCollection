package collection;

public class CollectionComprator {
	
	private String name;
	private int id;
	private int age;
	
	public CollectionComprator(String name, int id, int age) {
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

}
