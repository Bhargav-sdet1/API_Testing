package javaPractise;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {

		String name="Bhargav";
		
		char ch[]=name.toCharArray();
		
		Map<Character,Integer> hm= new HashMap<Character,Integer>();
		
		for(char c:ch)
		{
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}

}
