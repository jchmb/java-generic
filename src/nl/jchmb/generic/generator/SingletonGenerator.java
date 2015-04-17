package nl.jchmb.generic.generator;

public class SingletonGenerator<T> implements Generator<T> {
	private T singleton;
	
	public SingletonGenerator(T singleton) {
		this.singleton = singleton;
	}
	
	@Override
	public T generate() {
		return singleton;
	}
}
