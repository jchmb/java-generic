package nl.jchmb.generic.acceptor;

public class SimpleAcceptor<T> implements Acceptor<T> {
	private T matcher;
	
	public SimpleAcceptor(T matcher) {
		this.matcher = matcher;
	}
	
	@Override
	public boolean accept(T object) {
		return matcher.equals(object);
	}

}
