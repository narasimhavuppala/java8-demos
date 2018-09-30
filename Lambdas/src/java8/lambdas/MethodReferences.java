package java8.lambdas;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferences {

	public static void main(String[] args) {
		
		//Constructors

		Supplier<Student> producer = Student::new;
		System.out.println(producer.get());

		//Static Methods
		Consumer<Integer> printit = System.out::println;
		for (int i = 0; i < 2; i++) {
			printit.accept(i);
		}

		Student st = new Student(1, "Narasimha", "Vuppala", "nraovuppala@gmail.com", null);
		
		//Instance methods
		Supplier<Integer> c=st::getId;
		System.out.println(c.get());
		
		

	}

}
