package nl.jchmb.generic.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AggregateGenerator<T> implements Generator<T> {
	private List<Generator<T>> generators;
	private Random random;
	
	public AggregateGenerator() {
		generators = new ArrayList<Generator<T>>();
		random = new Random();
	}
	
	public AggregateGenerator<T> add(Generator<T> generator) {
		generators.add(generator);
		return this;
	}
	
	@Override
	public T generate() {
		return generators.get(random.nextInt(generators.size())).generate();
	}
}
