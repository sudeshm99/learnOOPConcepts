package learnOOPConcepts.inheritance;

 public abstract class Employee {
	protected String name;
	protected int age;
	protected double salary;
	
	/*public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}*/
	
	public static void DefaultPlan(){
		System.out.println("employee class static method");
	}
}
