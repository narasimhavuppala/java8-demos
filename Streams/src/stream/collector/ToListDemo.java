package stream.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import stream.Person;

public class ToListDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Max", 18));
		persons.add(new Person("Peter", 23));
		persons.add(new Person("Pamela", 23));
		persons.add(new Person("David", 12));

		Set<String> personsModified = persons.stream().map(Person::getName).filter(x -> x.startsWith("P"))
				.collect(Collectors.toSet());
		// toSet and toList

		String names = persons.stream().map(Person::getName).filter(x -> x.startsWith("P"))
				.collect(Collectors.joining("|"));
		System.out.println(names);

		// Joining

		personsModified.forEach(System.out::println);

	}

}
