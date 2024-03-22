package me.thecamzone.problem4;

public class Printer<T, K> {
	T object;
	K otherObject;

	public Printer(T object, K otherObject) {
		this.object = object;
		this.otherObject = otherObject;
	}

	public void print() {
		System.out.println(object);
		System.out.println(otherObject);
	}
}
