package collection;
import java.util.*;

public class AnimalMainMethod {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Set<Animal> animal=new LinkedHashSet<>();

		animal.add(new Animal("Hyena","ornnge",10));
		animal.add(new Animal("Lion","reddish-ornnge",4));
		animal.add(new Animal("Tiger","White",1));
		animal.add(new Animal("panther","black",2));
		animal.add(new Animal("leopard","reddish",3));
		animal.add(new Animal("Lion","ornnge",14));
		animal.add(new Animal("Fox","gary",8));




		for(Animal a:animal) {
			System.out.println(a);
		}
		System.out.println(animal.size());
		System.out.println(animal.contains("Tiger"));
		//	animal.remove("Lion");


		List<Animal> animalList = new ArrayList<>(animal);

		// Sort the List based on the 'name' property
		animalList.sort(Comparator.comparing(Animal::getleg));

		// Create a new LinkedHashSet from the sorted List
		LinkedHashSet<Animal> sortedAnimals = new LinkedHashSet<>(animalList);

		// Print the sorted LinkedHashSet
		sortedAnimals.forEach(System.out::println);
	}
}
