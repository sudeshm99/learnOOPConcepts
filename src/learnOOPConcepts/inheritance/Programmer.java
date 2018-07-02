package learnOOPConcepts.inheritance;

public class Programmer extends Employee implements trainable,Runner{
		
	String name = "programmer";
	
	public void gettingName(){
		System.out.println(name);
	}
/*	public Programmer(String name, int age, double salary) {
		super(name, age, salary);
		// TODO Auto-generated constructor stub
	}
*/

	public void getTraining() {
		System.out.println("Programmer get traininsg");
		
	}
public int speed() {
	// TODO Auto-generated method stub
	return 0;
}

void startProject() {
	// TODO Auto-generated method stub
	defineClasses();
	unitTesting();
}
public void defineClasses(){
	System.out.println("define classes");
}
public void unitTesting(){
	System.out.println("unit testing");
}
}
