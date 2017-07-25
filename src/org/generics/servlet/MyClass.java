package org.generics.servlet;
import java.util.Collections;
import java.util.List;

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
	
	 <K> void test(){
		 List<String> listOne = Collections.emptyList();
	}
	 
	 void foo(List<?> i) {
		 i.set(0, i.get(0));
	 }
}
