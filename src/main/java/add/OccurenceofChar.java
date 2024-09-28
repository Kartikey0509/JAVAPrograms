package add;

import java.util.HashMap;

public class OccurenceofChar {

	public static void main(String[] args) {
		
		String str="Hello how are you doing hhh";
		int count;
		char ch;
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
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
				System.out.print(key +" - "+ hm.get(key));
			}
		}

	}



