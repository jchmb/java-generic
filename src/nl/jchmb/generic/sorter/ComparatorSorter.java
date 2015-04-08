package nl.jchmb.generic.sorter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSorter<T> implements Sorter<T> {
	private Comparator<T> comparator;
	
	public ComparatorSorter(Comparator<T> comparator) {
		this.comparator = comparator;
	}
	
	@Override
	public void sort(List<T> list) {
		Collections.sort(list, comparator);
	}
}
