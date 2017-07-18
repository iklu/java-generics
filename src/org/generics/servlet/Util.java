package org.generics.servlet;

public class Util {
	/**
	 * GENERIC METHODS
	 * 
	 * The syntax for a generic method includes a type parameter, inside angle
	 * brackets, and appears before the method's return type. For static generic
	 * methods, the type parameter section must appear before the method's
	 * return type
	 * 
	 * The Util class includes a generic method, compare, which compares two IPair objects:
	 * 
	 * @param p1
	 * @param p2
	 * @return
	 */
	public static <K, V> boolean compare(IPair<K, V> p1, IPair<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
}
