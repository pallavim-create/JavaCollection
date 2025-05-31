package collection;

import java.util.HashMap;
import java.util.Map;

public class KeyValue {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap();
		m.put(01, "Alice");
		m.put(02, "bob");
		m.put(03, "charlie");
		m.put(04, "Doll");
		m.put(05, "doll");
		
	System.out.println(m.containsKey(06));	
		System.out.println(m);
	System.out.println(m.get(01));	
	System.out.println(m.get(3));	
//	System.out.println(m.remove(01, "Alice"));
	System.out.println(m.containsValue("a"));
	
	System.out.println(m.isEmpty());
	
	
	System.out.println(m);
	System.out.println(m.size());
	System.out.println(m.keySet());
	System.out.println(m.values());
	System.out.println(m.keySet());
	System.out.println(m.values());
	System.out.println(m.entrySet());


}
}
