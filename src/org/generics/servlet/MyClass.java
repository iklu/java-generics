package org.generics.servlet;

public class MyClass<X> {

	/**
	 * Type Inference and Generic Constructors of Generic and Non-Generic
	 * Classes
	 * 
	 * @param t
	 */
	<T> MyClass(T t) {

	}

	public static void main(String[] args) {
		MyClass<Integer> test = new MyClass<>("");
	}
}
