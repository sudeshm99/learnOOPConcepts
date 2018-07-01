package learnOOPConcepts.inheritance;

public class Manager extends Employee implements trainable, Interveiw{

	public void ConductingInterview() {
		System.out.println("Manager conducting interview");
		
	}

	public void getTraining() {
		System.out.println("Manager get training");
		
	}

	/*public Manager(String name, int age, double salary) {
		super(name, age, salary);
		// TODO Auto-generated constructor stub
	}
	*/
	
}
