package add;

import java.util.HashMap;

public class Wipro {

	public static void main(String[] args) {
		
		String s1= "Wipro Technologies";
		s1=s1.replace(" ", "");
		int count;
		
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		for(int i=0; i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(hm.containsKey(ch)) {
				count=hm.get(ch);
				count++;
				hm.replace(ch, count);
				
			}
			else {
				hm.put(ch, 1);
			}
			
		}
		for(Character key:hm.keySet()) {
			System.out.println(key+"---->"+hm.get(key));
		}
	}

}
