package nl.jchmb.generic.similarity;

public interface Similarity<T> {
	public float measure(T o1, T o2);
}
