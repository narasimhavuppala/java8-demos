package stream.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import stream.Person;

public class GroupingByDemo {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Max", 18));
		persons.add(new Person("Peter", 23));
		persons.add(new Person("Pamela", 23));
		persons.add(new Person("David", 12));

		// Getting Count for Each Age

		Map<Integer, Long> data = persons.stream()
				.collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
		System.out.println(data);

		//Be Defualt uses HashMap. We can override with the TreeMap or LinkedHashMap etc
		data = persons.stream().collect(Collectors.groupingBy(Person::getAge,TreeMap::new, Collectors.counting()));

		System.out.println(data);

	}

}
