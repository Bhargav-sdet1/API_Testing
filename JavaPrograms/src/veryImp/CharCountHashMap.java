package veryImp;

import java.util.HashMap;

public class CharCountHashMap {

	public static void main(String[] args) {

		charCount("I love java programming");

	}

	private static void charCount(String string) {
		
		char ch[]=string.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c,1);
			}
		}
		System.out.println(hm);
		
		
	}

}
