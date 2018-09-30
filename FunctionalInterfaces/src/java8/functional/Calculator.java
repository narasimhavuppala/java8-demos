package java8.functional;

@FunctionalInterface //Not Mandatory
public interface Calculator<T> {

	
	//Only one Abstract method allowed
	T calculate(T a, T b);
	


	//Can have many default emthods
	default int add(int a, int b) {

		return a + b;
	}

}
