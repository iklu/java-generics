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
	 * The Util class includes a generic method, compare, which compares two
	 * IPair objects:
	 * 
	 * @param p1
	 * @param p2
	 * @return
	 */
	public static <K, V> boolean compare(IPair<K, V> p1, IPair<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}

	/**
	 * 
	 * The implementation of the method is straightforward, but it does not
	 * compile because the greater than operator (>) applies only to primitive
	 * types such as short, int, double, long, float, byte, and char. You cannot
	 * use the > operator to compare objects.
	 * 
	 * @param anArray
	 * @param elem
	 * @return
	 */
	public static <T> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray)
			// if (e > elem) // compiler error
			// ++count;
			++count;
		return count;
	}
	
	/**
	 * To fix the problem, use a type parameter bounded by the Comparable<T> interface:
	 * 
	 * Wrapper class Integer implements Comparable
	 * 
	 * @param anArray
	 * @param elem
	 * @return
	 */
	public static <T extends Comparable<T>> int countGreaterThan1(T[] anArray, T elem) {
	    int count = 0;
	    for (T e : anArray)
	        if (e.compareTo(elem) > 0)
	            ++count;
	    return count;
	}
	
	
}
