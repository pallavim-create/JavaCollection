package collection;

import java.util.Comparator;
import java.util.Objects;

public class Animal implements Comparable<Animal> {
	private String name;
	private String color;
	private int leg;
	
	
	public Animal(String name,String color,int leg) {
		this.name=name;
		this.color=color;
		this.leg=leg;
		
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
		
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public String getcolor() {
		return color;
	}
	public void setleg(int leg) {
		this.leg=leg;
	}
	public int getleg() {
		return leg;
	}
	
	
	  @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Animal animal = (Animal) obj;
	        return leg == animal.leg &&
	               Objects.equals(name,animal.name) &&
	               Objects.equals(color, animal.color);
	    }
	@Override
	public int hashCode() {
		return Objects.hash(color, leg, name);
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", leg=" + leg + "]";
	}
//
//	public void sort(Comparator<Animal> comparing) {
//		// TODO Auto-generated method stub
//		
//	}
//	

	@Override
	public int compareTo(Animal ani) {
		return this.getname().compareTo(ani.getname());
	}
		
		
//		if(this.getname() > ani.getname())
//			return 1;
//		else
//			return -1;
//
//
//	}

	public static boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	public void sort(Comparator<Animal> comparing) {
		// TODO Auto-generated method stub
		
	}

	
	
/*	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Animal other = (Animal) obj;
	    return leg == other.leg &&
	           Objects.equals(name, other.name);
	           //&&
	     //      Objects.equals(color, other.color);
	}

	@Override
	public int hashCode() {
	    return Objects.hash(name);
	}*/

}
