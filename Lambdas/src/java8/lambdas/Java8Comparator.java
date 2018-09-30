package java8.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Comparator {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			students.add(new Student(i, "test" + i, "last" + i, null, null));

		}

		//Optional Type Declaration
		//Optional parenthesis around parameters
		//Optional Curly braces
		//Optional return statement
		Comparator<Student> c = (arg0, arg1) -> {return arg0.getFirstName().compareTo(arg1.getFirstName());};
		Collections.sort(students, c);
		students.forEach(System.out::println);

	}

}
