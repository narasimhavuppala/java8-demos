package stream.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import stream.Person;

public class ToListDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Max", 18));
		persons.add(new Person("Peter", 23));
		persons.add(new Person("Pamela", 23));
		persons.add(new Person("David", 12));

		List<String> personsModified = persons.stream().map(x -> x.getName()).filter(x -> {
			return x.startsWith("P");
		}).collect(Collectors.toList());
		personsModified.forEach(System.out::println);

	}

}
