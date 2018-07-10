package learnOOPConcepts.inheritance;

public class Emp {
	String name;
	int pformaceRating;
	double salary;
	Emp(String nam, int rating, double sal){
		name=nam;
		pformaceRating=rating;
		salary=sal;
	}
	public String getName() {
		return name;
	}
	public int getPformaceRating() {
		return pformaceRating;
	}
	public double getSalary() {
		return salary;
	}
	public String toString() {
		return "Emp [name=" + name + ", pformaceRating=" + pformaceRating
				+ ", salary=" + salary + "]";
	}
	Emp emp = new Emp("sudesh", 3, 100000);
	ValidateName valName = new ValidateName();
	ValidateProformingRate valProf = new ValidateProformingRate();
	
	
}
