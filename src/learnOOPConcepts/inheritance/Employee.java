package learnOOPConcepts.inheritance;

 public  class Employee {
	protected String name="employee";
	protected int age;
	protected double salary;
	
	/*public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}*/
	public void reachOffice(){
		System.out.println("office in india");
	}
	
	
	public static void DefaultPlan(){
		System.out.println("employee class static method");
	}
}
