package stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Max", 18));
		persons.add(new Person("Peter", 23));
		persons.add(new Person("Pamela", 23));
		persons.add(new Person("David", 12));

		// test2(persons);
		// test3(persons);
		// test4(persons);
		// test5(persons);
		// test6(persons);
		test7(persons);

		// test8(persons);
		// test9(persons);
	}

	private static void test2(List<Person> persons) {
		Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(p -> p.getAge()));
		personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

	}

	private static void test3(List<Person> persons) {
		Double averageAge = persons.stream().collect(Collectors.averagingInt(p -> p.getAge()));

		System.out.println(averageAge); // 19.0
	}

	private static void test4(List<Person> persons) {
		IntSummaryStatistics ageSummary = persons.stream().collect(Collectors.summarizingInt(p -> p.getAge()));

		System.out.println(ageSummary);
	}

	private static void test5(List<Person> persons) {
		String names = persons.stream().filter(p -> p.getAge() >= 18).map(p -> p.getName())
				.collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

		System.out.println(names);
	}

	private static void test6(List<Person> persons) {
		Map<Integer, String> map = persons.stream()
				.collect(Collectors.toMap(p -> p.getAge(), p -> p.getName(), (name1, name2) -> name1 + ";" + name2));

		System.out.println(map);
		// {18=Max, 23=Peter;Pamela, 12=David}
	}

	private static void test7(List<Person> persons) {
		Collector<Person, StringJoiner, String> personNameCollector = Collector.of(() -> new StringJoiner(" | "), // supplier
				(j, p) -> j.add(p.getName().toUpperCase()), // accumulator
				(j1, j2) -> j1.merge(j2), StringJoiner::toString);

		String names = persons.stream().collect(personNameCollector);

		System.out.println(names); // MAX | PETER | PAMELA | DAVID
	}

	private static void test8(List<Person> persons) {
		Collector<Person, StringJoiner, String> personNameCollector = Collector.of(() -> {
			System.out.println("supplier");
			return new StringJoiner(" | ");
		}, (j, p) -> {
			System.out.format("accumulator: p=%s; j=%s\n", p, j);
			j.add(p.getName().toUpperCase());
		}, (j1, j2) -> {
			System.out.println("merge");
			return j1.merge(j2);
		}, j -> {
			System.out.println("finisher");
			return j.toString();
		});

		String names = persons.stream().collect(personNameCollector);

		System.out.println(names); // MAX | PETER | PAMELA | DAVID
	}

	private static void test9(List<Person> persons) {
		Collector<Person, StringJoiner, String> personNameCollector = Collector.of(() -> {
			System.out.println("supplier");
			return new StringJoiner(" | ");
		}, (j, p) -> {
			System.out.format("accumulator: p=%s; j=%s\n", p, j);
			j.add(p.getName().toUpperCase());
		}, (j1, j2) -> {
			System.out.println("merge");
			return j1.merge(j2);
		}, j -> {
			System.out.println("finisher");
			return j.toString();
		});

		String names = persons.parallelStream().collect(personNameCollector);

		System.out.println(names); // MAX | PETER | PAMELA | DAVID
	}
}
