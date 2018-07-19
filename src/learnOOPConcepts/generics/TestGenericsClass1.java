package learnOOPConcepts.generics;

import java.util.ArrayList;

public class TestGenericsClass1 {
	public static void main(String args){
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("abc");
		arr.add("def");
		String s = arr.get(1);
		System.out.println("element is : "+s);
		
	}
}
