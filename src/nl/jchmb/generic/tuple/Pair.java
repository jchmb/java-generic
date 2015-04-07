package nl.jchmb.generic.tuple;

public class Pair<T1, T2> {
	private final T1 o1;
	private final T2 o2;
	
	public Pair(T1 o1, T2 o2) {
		this.o1 = o1;
		this.o2 = o2;
	}
	
	public T1 getLeft() {
		return o1;
	}
	
	public T2 getRight() {
		return o2;
	}
	
	@Override
	public int hashCode() {
		return 2 * o1.hashCode() + 3 * o2.hashCode();
	}
	
	@Override
	public boolean equals(Object that) {
		if (!(that instanceof Pair<?, ?>)) {
			return false;
		}
		Pair<?, ?> thatPair = (Pair<?, ?>) that;
		return o1.equals(thatPair.getLeft()) && o2.equals(thatPair.getRight());
	}
}
