package generic;

public class GenericClass <T>{
	
	public T name;
	
	
	GenericClass(T name){
		this.name=name;
		
	}
	
	void print() {
		System.out.println(name);
	}
	
	public static<T> void printArray(T[] inputArray) {
		
		for(T element:inputArray) {
			System.out.println(element+" ");
		}
		//System.out.println();
	}
		
	
	
	public static<T,U> boolean test(T t1,U u1,T t2,U u2) {
		return t1.equals(t2) && u1.equals(u2);
		
		
	}

}
	

