package learnOOPConcepts.inheritance;

public class ValidateProformingRate implements Validate{

	public boolean check(Emp emp) {
		// TODO Auto-generated method stub
		return (emp.getPformaceRating() >=5);
	}

}
