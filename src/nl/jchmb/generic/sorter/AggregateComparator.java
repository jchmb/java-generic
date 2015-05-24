package nl.jchmb.generic.sorter;

import java.util.Comparator;
import java.util.List;

public class AggregateComparator<T> implements Comparator<T> {
	private List<Comparator<T>> comparators;

	@Override
	public int compare(T o1, T o2) {
		int cmp;
		for (Comparator<T> comparator : comparators) {
			cmp = comparator.compare(o1, o2);
			if (cmp != 0) {
				return cmp;
			}
		}
		return 0;
	}
	
	public AggregateComparator<T> add(Comparator<T> comparator) {
		comparators.add(comparator);
		return this;
	}
}
