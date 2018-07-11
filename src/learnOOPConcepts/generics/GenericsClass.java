package learnOOPConcepts.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsClass {
	List<List<String>> list = new ArrayList<>();
	List<String> list2 = new ArrayList<>();
	List<String> list3 = new ArrayList<>();


	public void genericMethod(){
		System.out.println(list2);
		System.out.println(list);
		list2.add("String");
		list2.add("second");
		list2.add("thierd");
		list3.add("String2");
		list3.add("second2");
		list3.add("thierd2");		
		System.out.println(list2);
		list.add(list2);
		list.add(list3);
		System.out.println(list);
	}
}

