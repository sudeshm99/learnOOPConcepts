package learnOOPConcepts.inheritance;

public interface Interveiw {
	
	 void ConductingInterview();// public abstract 
	
	default void Interviewer(){
		Systom.out.println("accepted");
	}

}
