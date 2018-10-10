package stream.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import stream.Person;

public class ReducerDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Max", 18));
		persons.add(new Person("Peter", 23));
		persons.add(new Person("Pamela", 23));
		persons.add(new Person("David", 12));

		System.out.println("******Test1*********");
		test1(persons);

		System.out.println("******Test2*********");
		test2(persons);

		System.out.println("******Test3*********");
		test3(persons);

		System.out.println("******Test4*********");
		test4(persons);

		System.out.println("******Test5*********");
		test5(persons);

		System.out.println("******Test6*********");
		test6(persons);
	}

	private static void test1(List<Person> persons) {
		persons.stream().reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2).ifPresent(System.out::println);
	}

	private static void test2(List<Person> persons) {
		Person result = persons.stream().reduce(new Person("", 0), (p1, p2) -> {
			p1.setAge(p1.getAge() + p2.getAge());
			p1.setName(p1.getName() + p2.getName());
			return p1;
		});

		System.out.format("name=%s; age=%s", result.getName(), result.getAge());
		System.out.println("");
	}

	private static void test3(List<Person> persons) {
		Integer ageSum = persons.stream().reduce(0, (sum, p) -> sum += p.getAge(), (sum1, sum2) -> sum1 + sum2);

		System.out.println(ageSum);
	}

	private static void test4(List<Person> persons) {
		Integer ageSum = persons.stream().reduce(0, (sum, p) -> {
			System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
			return sum += p.getAge();
		}, (sum1, sum2) -> {
			System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
			return sum1 + sum2;
		});

		System.out.println(ageSum);
	}

	private static void test5(List<Person> persons) {
		Integer ageSum = persons.parallelStream().reduce(0, (sum, p) -> {
			System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
			return sum += p.getAge();
		}, (sum1, sum2) -> {
			System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
			return sum1 + sum2;
		});

		System.out.println(ageSum);
	}

	private static void test6(List<Person> persons) {
		Integer ageSum = persons.parallelStream().reduce(0, (sum, p) -> {
			System.out.format("accumulator: sum=%s; person=%s; thread=%s\n", sum, p, Thread.currentThread().getName());
			return sum += p.getAge();
		}, (sum1, sum2) -> {
			System.out.format("combiner: sum1=%s; sum2=%s; thread=%s\n", sum1, sum2, Thread.currentThread().getName());
			return sum1 + sum2;
		});

		System.out.println(ageSum);
	}
}
