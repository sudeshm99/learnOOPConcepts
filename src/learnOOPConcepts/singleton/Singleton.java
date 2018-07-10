package learnOOPConcepts.singleton;

public class Singleton {
	private static Singleton instance;
	public static Singleton getInstance(){
		/*Singleton singleton = Holder.instance;
		System.out.println(singleton);
		return singleton;*/
		if(instance==null){
			instance = new Singleton();
		}
		return instance;
	}
	
	private Singleton() {
	
	}
	
	private static class Holder{
		private static final Singleton instance = new Singleton();// attribute must be private so no other class can use it
		// also attribute chould be static  so it will be class veriable and it will be create automatically 
		// it should be final no other instance can be created later		
	}	

}
