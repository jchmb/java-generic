package nl.jchmb.generic.array;

import java.util.Iterator;

public class IterableArray<T> implements Iterable<T> {
	private T[] array;
	
	public IterableArray(T[] array) {
		this.array = array;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new ArrayIterator<T>(array);
	}

}
