package nl.jchmb.generic.generator;

import java.util.Random;

public class SimpleGenerator<T> implements Generator<T> {
	private T[] values;
	private Random random;
	
	public SimpleGenerator(T[] values) {
		this.values = values;
		random = new Random();
	}
	
	@Override
	public T generate() {
		return values[random.nextInt(values.length)];
	}

}
