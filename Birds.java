package collection;

public class Birds implements Comparable<Birds> {
	private String name;
	private String color;
	private int num;
	
	

	public  Birds(String name,String color,int num) {
		this.name=name;
		this.color=color;
		this.num=num;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String name) {
		this.color=color;
	}
	public int getnum() {
		return num;
	}
	public void setnum(int num) {
		this.num=num;
	}

	@Override
	public String toString() {
		return "Birds [name=" + name + ", color=" + color + ", num=" + num + "]";
	}

	@Override
	public int compareTo(Birds other) {
		// TODO Auto-generated method stub
		 return this.name.compareTo(other.name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Birds bird = (Birds) obj;
		return name.equals(bird.name); // assuming name uniquely identifies a bird
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}


	


