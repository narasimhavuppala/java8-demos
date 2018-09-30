package java8.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java7Comparator {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();

		for(int i=0; i < 100; i++){
			students.add(new Student(i,"test" +i,"last"+i,null,null));
			
		}
		
		//Compare Based on their First Name
		Collections.sort(students,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o1.getLastName());
			}
		});
		for(Student s:students){
			System.out.println(s);
		}
	}

}
