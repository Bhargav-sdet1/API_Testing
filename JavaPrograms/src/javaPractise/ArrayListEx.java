package javaPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListEx {

	public static void main(String[] args) {

		List al= new ArrayList();
		al.add("Bhargav");
		al.add(5558);
		al.add(true);
		System.out.println(al);
		System.out.println(al.size());
		
		Set set= new HashSet();
		set.add("Vithika");
		set.add(5558);
		set.add(true);
		System.out.println(set);
		System.out.println(set.size());
		
		Map<Integer, String> map= new HashMap<Integer,String>();
		map.put(101, "Bhargav");
		map.put(201, "Vithika");
		System.out.println(map);
		
		//Iterator<String> it=windowHandles.iterator();
		//String ParentId=it.next();
		//String ChildId=it.next();

	}

}
