package learnOOPConcepts.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsClass {
	List<String> list = new ArrayList<String>();
	public void genericMethod(){
		list.add("String");
		System.out.println(list);
		Object str =  list.get(0);
		System.out.println(str);
		String str2 = (String) list.get(0);
		System.out.println(str2);
	}
}

