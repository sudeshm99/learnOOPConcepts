package learnOOPConcepts.encapsulation;

import java.text.ParseException;

public class MyClass {
	private int name;
	
	public void setName(String name) {
		try {
			this.name = Integer.parseInt(name);
		} catch (Exception e) {
			// TODO: handle exception'
			this.name=0;
		}		
	}

	void myMethod(){
		System.out.println("Hi ..."+name);
	}
}
