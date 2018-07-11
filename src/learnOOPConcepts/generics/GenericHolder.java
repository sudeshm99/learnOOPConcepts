package learnOOPConcepts.generics;

public class GenericHolder<T> {
	private T variable;

	public GenericHolder(T variable) {
		this.variable = variable;
	}
	
	public T GenaricGetObject(){
		return variable;
	}

	public void printGenericObject(){
		System.out.println(variable);
	}
}
