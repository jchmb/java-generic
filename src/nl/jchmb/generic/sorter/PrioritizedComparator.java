package nl.jchmb.generic.sorter;

import java.util.Comparator;

public class PrioritizedComparator<T extends Prioritizable> implements Comparator<T> {

	@Override
	public int compare(T arg0, T arg1) {
		int p1, p2;
		
		p1 = arg0.getPriority();
		p2 = arg1.getPriority();
		
		return p1 == p2 ? 0 : (p1 > p2 ? 1 : -1);
	}

}
