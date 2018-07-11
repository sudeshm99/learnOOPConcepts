package learnOOPConcepts.generics;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	GenericsClass genericsClass = new GenericsClass();
		genericsClass.genericMethod();*/
		GenericHolder<String> holder = new GenericHolder<String>("sudesh");
		holder.printGenericObject();
		System.out.println(holder.GenaricGetObject());
		
		GenericHolder<Integer> intHolder = new GenericHolder<Integer>(1);
		intHolder.printGenericObject();
		System.out.println(intHolder.GenaricGetObject());
	}

}
