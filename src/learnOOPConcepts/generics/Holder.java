package learnOOPConcepts.generics;

public class Holder {
	private String s;

	public Holder(String s) {
		this.s = s;
	}
	public String getObject(){
		return s;
	}
	
	public void printObject(){
		System.out.println(s);
	}
}
