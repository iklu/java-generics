package org.generics.servlet;

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class Box<T> {

	// T stands for "Type"
	private T obj;

	/**
	 * @return the obj
	 */
	public Object getObj() {
		return obj;
	}

	/**
	 * @param objbthe
	 *            obj to set
	 */
	public void setObj(T obj) {
		this.obj = obj;
	}

	/**
	 * It depends on what you need to do. You need to use the bounded type
	 * parameter if you wanted to do something like this:
	 * 
	 * public <T extends Shape> void addIfPretty(List<T> shapes, T shape) { if
	 * (shape.isPretty()) { shapes.add(shape); } }
	 * 
	 * Here we have a List<T> shapes and a T shape, therefore we can safely
	 * shapes.add(shape). If it was declared List<? extends Shape>, you can NOT
	 * safely add to it (because you may have a List<Square> and a Circle).
	 */

	/**
	 * GENERIC METHOD (bound) we gone use U inside the scope method like in the
	 * class above we add bounds (U extends another Type, [ our generic type of
	 * U has to have a bound of type Number])
	 * 
	 * restrict the types that can be used as type arguments in a parameterized
	 * type
	 * 
	 * @param u
	 */
	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + obj.getClass().getName());
	}
	
	public void add(T objs){
		
	}
}
