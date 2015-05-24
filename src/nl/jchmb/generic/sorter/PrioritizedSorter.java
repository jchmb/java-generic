package nl.jchmb.generic.sorter;

public class PrioritizedSorter<T extends Prioritizable> extends ComparatorSorter<T> {
	public PrioritizedSorter() {
		super(new PrioritizedComparator<T>());
	}
}
