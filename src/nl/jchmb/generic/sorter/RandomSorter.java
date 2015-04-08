package nl.jchmb.generic.sorter;

import java.util.Collections;
import java.util.List;

public class RandomSorter<T> implements Sorter<T> {
	@Override
	public void sort(List<T> list) {
		Collections.shuffle(list);
	}
}
