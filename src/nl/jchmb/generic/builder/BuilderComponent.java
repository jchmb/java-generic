package nl.jchmb.generic.builder;

public interface BuilderComponent<T, Instruction> {
	public boolean accept(Instruction instruction);
	public void build(T product, Instruction instruction);
}
