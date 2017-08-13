package java8.streams;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsMain {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		for (int i = 0; i < 1000; i++) {
			students.add(new Student(i, "FirstName" + i, "Last Name" + i, "test" + i + "@gmail.com",
					LocalDate.now().minus(i, ChronoUnit.DAYS)));

		}

		//students.forEach((s) -> System.out.println(s));

		// Extract Stream

		Stream<Student> s = students.stream();
		s.filter(st -> st.getDob().isBefore(LocalDate.now())).forEach(System.out::println);;
		//s.map(st->st.getEmail().contains("10"));
		//s.forEach(System.out::println);

	}

}
