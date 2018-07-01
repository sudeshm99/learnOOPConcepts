package learnOOPConcepts.inheritance;

import java.time.LocalDateTime;

public class Manager extends Employee implements trainable, Interveiw{

	public void ConductingInterview() {
		System.out.println("Manager conducting interview");
		
	}

	public void getTraining() {
		System.out.println("Manager get training");
		
	}

	public Object Interviewer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void bookConferenceRoom(LocalDateTime dateTime, int duration) {
		// TODO Auto-generated method stub
		
	}



	/*public Manager(String name, int age, double salary) {
		super(name, age, salary);
		// TODO Auto-generated constructor stub
	}
	*/
	
}
