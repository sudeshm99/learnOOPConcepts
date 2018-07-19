package learnOOPConcepts.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Geust {
	public static void main(String[] args){
		Glass glass = new Glass();
		Liquid liquid = new Liquid();
		List list = new ArrayList();
		list.add("string");
		list.add(123);
		String str = (String)list.get(0);
		Integer val = (Integer)list.get(1);
		//System.out.println(val);
		
		List<String> gList = new ArrayList<String>();
		gList.add("str");
		gList.add(null);
		gList.add(2, "3");
		String s = gList.get(0);
		gList.addAll(3, gList);
		//gList.addAll(12.2);
		//System.out.println(gList);
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("abc");
		arr.add("def");
		//String s = arr.get(1);
//		System.out.println("element is : "+s);
		
	/*	Iterator<String> itr = arr.iterator();
		while(itr.hasNext()){
//			System.out.println(itr.next());
		}*/
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("FName", "sudesh");
		//map.put(1, "test");
		map.put("Lname", "madu");
		map.put("Initials", "kgs");
		System.out.println(map);
		Set<Map.Entry<String, String>> setMap = map.entrySet();
		System.out.println(setMap);
		Iterator<Map.Entry<String, String>> itrMap = setMap.iterator();
		while(itrMap.hasNext()){
			System.out.println(itrMap.next());
		}
	}
}
