package learnOOPConcepts.generics;

public class Glass<T extends Liquid> {// T is type parameter
	public T liquid;
	
	public String getTeast(){
		return liquid.taste();
	}
}
