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
/*
		// Compare Based on their First Name
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getFirstName().compareTo(o1.getLastName());
			}
		});*/

		Comparator<Student> c = (Student arg0, Student arg1) -> arg0.getFirstName().compareTo(arg0.getLastName());
		Collections.sort(students,c);
		//students.forEach(s -> System.out.println(s));
		students.forEach( System.out::println);

		// for(Student s:students){
		// System.out.println(s);
		// }
	}

}
