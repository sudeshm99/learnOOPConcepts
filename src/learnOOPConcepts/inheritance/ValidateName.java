package learnOOPConcepts.inheritance;

public class ValidateName implements Validate {

	public boolean check(Emp emp) {
		// TODO Auto-generated method stub
		return (emp.getName().startsWith("P"));
	}
	
}
