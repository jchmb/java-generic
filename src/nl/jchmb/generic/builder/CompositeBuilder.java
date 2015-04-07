package nl.jchmb.generic.builder;

public interface CompositeBuilder<T, Instruction> extends Builder<T> {
	public void add(BuilderComponent<T, Instruction> component);
}
