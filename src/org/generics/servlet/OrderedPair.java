package org.generics.servlet;

/**
 * GENERIC CLASS
 * 
 * @author ovidiu.dragoi
 *
 * @param <K>
 * @param <V>
 */
public class OrderedPair<K, V>  implements IPair <K, V>{
	
	private K key;
	private V value;
	
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see org.testimport.servlet.Pair#getKey()
	 */
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}

	/* (non-Javadoc)
	 * @see org.testimport.servlet.Pair#getValue()
	 */
	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}
	
}
