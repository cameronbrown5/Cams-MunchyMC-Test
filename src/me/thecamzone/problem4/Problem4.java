package me.thecamzone.problem4;

public class Problem4<T, K> {
	
	public static void main(String[] args) {
		// Create instance of printer, give it an Integer and a Double, and print both generic objects.
		createInstance(Integer.valueOf(15), Double.valueOf(19.25D)).print();
	}

	public static <T, K> Printer<T, K> createInstance(T object, K otherObject) {
		return new Printer<>(object, otherObject);
	}
}
