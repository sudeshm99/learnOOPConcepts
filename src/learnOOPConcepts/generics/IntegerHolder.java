package learnOOPConcepts.generics;

public class IntegerHolder {
	private Integer s;

	public IntegerHolder(Integer s) {
		this.s = s;
	}
	
	public Integer getIntegerObject(){
		return s;
	}
	
	public void printIntegerObject(){
		System.out.println(s);
	}
}
