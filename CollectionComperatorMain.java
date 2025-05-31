package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionComperatorMain {
	public static void main(String[] args) {



		List<CollectionComprator> com = new ArrayList<>();
		com.add(new CollectionComprator("Anita",1001,38));
		com.add(new CollectionComprator("Ankita",1009,68));
		com.add(new CollectionComprator("Anyra",1003,9));
		com.add(new CollectionComprator("Amulya",1005,89));


		Comparator<CollectionComprator> cc=new Comparator<>() {
			public int compare(CollectionComprator o1, CollectionComprator o2) {
				if(o1.getId() > o2.getId()) 
					return 1;
				else
					return -1;
			}

		};
		Collections.sort(com,cc);
		for(CollectionComprator c:com) {
			System.out.println(c);


		}
	}







}

