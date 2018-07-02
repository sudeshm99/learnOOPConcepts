package learnOOPConcepts.inheritance;

public class MainClass {

	public static void main(String[] args) {
		/*Employee.DefaultPlan();
		Employee employee = new Manager();
		employee.DefaultPlan();
		Manager manager = new Manager();
		manager.DefaultPlan();
		manager.ConductingInterview();*/
		
		Interveiw manager = new Manager();
		System.out.println(((Manager)manager).test1);
		
	}

}
