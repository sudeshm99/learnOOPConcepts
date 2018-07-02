package learnOOPConcepts.inheritance;

import java.time.LocalDateTime;

public class Manager extends Employee implements trainable, Interveiw{
	String test1="u accessed!";
	public void ConductingInterview() {
		System.out.println("Manager conducting interview");
		System.out.println(val);
		//System.out.println(Interveiw.val);
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

	void startProject() {
		// TODO Auto-generated method stub
		meetClient();
		alocateResoruces();
		
	}
	
	void meetClient(){
		System.out.println("meet client");
	}
	void alocateResoruces(){
		System.out.println("allocated resorces");
	}



	/*public Manager(String name, int age, double salary) {
		super(name, age, salary);
		// TODO Auto-generated constructor stub
	}
	*/
	
}
