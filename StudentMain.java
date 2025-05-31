package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List<Students1> stu = new ArrayList<>();
			stu.add(new Students1("Chandu",1008,26));
			stu.add(new Students1("Anita",1001,38));
			stu.add(new Students1("Bhavya",1009,68));
			stu.add(new Students1("Anyra",1003,9));
			stu.add(new Students1("Ankita",1005,89));
		
			
			
			
			Collections.sort(stu);
			for(Students1 s:stu) {
				System.out.println(s);
			}
			
			
			ListIterator<Students1> student =stu.listIterator();
			
			System.out.println("********Forward***********");
			
			while(student.hasNext()) {
				System.out.println(student.next());
			}
			
		
//			System.out.println("************Backword**********");
//			
//			while(student.hasPrevious()) {
//				System.out.println(student.hasPrevious());
//			}
			
			System.out.println("********Iterator***********");
			
			Iterator<Students1> student1=stu.iterator();
			for(Students1 student11:stu) {
				System.out.println(student11);
			}
			System.out.println("******String sorting*******");
			 Collections.sort(stu, (a, b) -> a.compareTo(b));
		        System.out.println(stu);

		}

	}


