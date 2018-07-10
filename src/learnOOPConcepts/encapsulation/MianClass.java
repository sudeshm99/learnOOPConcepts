package learnOOPConcepts.encapsulation;

import learnOOPConcepts.singleton.Singleton;

public class MianClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass = new MyClass();
		myClass.myMethod();
		myClass.setName("osdf");
		Singleton.getInstance();
	
	}

}
