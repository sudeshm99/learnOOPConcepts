package learnOOPConcepts.inheritance;

public class MainClass {

	public static void main(String[] args) {
		/*Employee.DefaultPlan();
		Employee employee = new Manager();
		employee.DefaultPlan();
		Manager manager = new Manager();
		manager.DefaultPlan();
		manager.ConductingInterview();*/
		
		Employee emp = new Employee();
		Employee pro = new Programmer();
		System.out.println(emp.name);
		System.out.println(pro.name);
		((Programmer) pro).gettingName();
		
	}

}
