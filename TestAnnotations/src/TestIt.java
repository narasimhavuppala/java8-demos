import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class TestIt {
	@Target({ ElementType.TYPE_PARAMETER, ElementType.TYPE_USE })
	@interface NotNull {

	}
	@Retention(RetentionPolicy.RUNTIME)
	@interface Hints {
		Hint[] value();
	}

	@Repeatable(Hints.class)
	@Retention(RetentionPolicy.RUNTIME)
	@interface Hint {
		String value();
	}

	@Hint("hint1-Hello")
	@Hint("hint2-hellowWorld")
	class Person {

	}
	

	public static void main(String[] args) {
		Hint hint = Person.class.getAnnotation(Hint.class);
		System.out.println(hint); // null

		Hints hints1 = Person.class.getAnnotation(Hints.class);
		System.out.println(hints1.value().length); // 2

		Hint[] hints2 = Person.class.getAnnotationsByType(Hint.class);
		System.out.println(hints2.length); // 2
		@NotNull String s="test it";
		
		

	}

}
