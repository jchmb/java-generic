package nl.jchmb.generic.array;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
	private T[] array;
	private int cursor;
	
	public ArrayIterator(T[] array) {
		this.array = array;
		cursor = 0;
	}
	
	@Override
	public boolean hasNext() {
		return cursor < array.length;
	}

	@Override
	public T next() {
		return array[cursor++];
	}

	@Override
	public void remove() {
		
	}
}
