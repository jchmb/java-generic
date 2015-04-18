package nl.jchmb.generic.sorter;

import java.util.List;

/**
 * A sorter with null behavior. 
 */
public class NullSorter<T> implements Sorter<T> {
	@Override
	public void sort(List<T> list) {
		/* Empty. */
	}
}
