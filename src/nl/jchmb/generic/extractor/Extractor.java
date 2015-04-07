package nl.jchmb.generic.extractor;

public interface Extractor<X, Y> {
	public Y extract(X object);
}
