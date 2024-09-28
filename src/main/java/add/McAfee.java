package add;

import java.util.HashMap;
import java.util.HashSet;

public class McAfee {
		
	int num1;
	static int num2;
	static String str;
	
	public static void main(String[] args) {
	int num=1;
	McAfee af=new McAfee();
	System.out.println(num2);
	System.out.println(af.num1);
	System.out.println(num);
	System.out.println(str);
	
	String s="A man, a plan, a canal: Panama";
	s.toLowerCase();
//for(int i=0;i<s.length();i++) cat==act char[arr]++, char[arr]-- 
//	s.charAt(0)==s.charAt(n-1);
	
	//remove space and special character and then reverse and check palindrome
	 s= s.replace(" ", "");
	System.out.println(s); //No space
	
	 s = s.replaceAll("[^A-Za-z0-9]", "");
	System.out.println(s);
	
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}

	System.out.println(rev);
	if(rev.equalsIgnoreCase(s)) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	
	
	String str2="cata";
	String str3 ="act";
	int count;
	HashMap<Character, Integer>map= new HashMap<Character, Integer>();
	for(int i=0; i<str2.length();i++) {
		char c =str2.charAt(i);
		if(map.containsKey(c)) {
			count= map.get(c);
			count++;
			map.replace(c, count);
		}
		else {
			map.put(c, 1);
	
		
		}
		
	}
	for(Character key: map.keySet()) {
		
		System.out.println(key+"--->"+map.get(key));
		
	}
	
	}

}
