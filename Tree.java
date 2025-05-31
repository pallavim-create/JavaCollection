package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tree  {

	public static void main(String[] args) {
		
	Set<Birds> birds=new TreeSet<>();
	birds.add(new Birds("peacock","Darkblue",100));
	birds.add(new Birds("HummingBird","gray",1));
	birds.add(new Birds("pigeon","blue",200));
	birds.add(new Birds("crow","black",50));
	birds.add(new Birds("parrot","green",150));
	birds.add(new Birds("duck","white",70));
	
	
	
	
	//Collections.sort(birds);
	for(Birds b:birds) {
		System.out.println(b);
	}
	
	Birds searchbird=new Birds("crow","black",200);
	System.out.println(birds.contains(searchbird));
	
	Birds searchbird1=new Birds("myna","brown",200);
	System.out.println(birds.contains(searchbird1));
	
    Iterator<Birds> it=birds.iterator();
    while(it.hasNext()) {
    	Birds b=it.next();
    	System.out.println(b);
    	
    }
	

	}

}
