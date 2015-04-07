package nl.jchmb.generic.convertor;

public interface Convertor<X, Y> {
	public Y convert(X object);
}
