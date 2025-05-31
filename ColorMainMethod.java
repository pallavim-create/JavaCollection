package collection;

import java.util.ArrayList;

public class ColorMainMethod {

	
	public static void main(String[] args) {
		ArrayList< ColorListFuction> color=new  ArrayList<>();
		color.add(new ColorListFuction("Red", "Green", "Blue"));
		color.add(new ColorListFuction("pink", "powder pink", "peach"));
		color.add(new ColorListFuction("white","milky white","pestel white"));
		
		for(ColorListFuction c:color) {
			System.out.println(c);
			//c.diplay();
		}

		
		//color.remove(1);
		System.out.println("ArrayList Methods");
		System.out.println(color.get(1));
		
	
		System.out.println(color.remove(color));
		
		System.out.println(color.size());
		
		
		
        
		
		
	}
}


