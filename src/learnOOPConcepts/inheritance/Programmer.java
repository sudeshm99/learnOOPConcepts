package learnOOPConcepts.inheritance;

public class Programmer extends Employee implements trainable,Runner{
		
	public void accessBasedClass(){
		name = "sudesh";
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
}
