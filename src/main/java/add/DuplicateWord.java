package add;

import java.util.HashSet;

public class DuplicateWord {

	public static void main(String[] args) {
		String names[]= {"Java", "C", "Python", "C", "Java", "JavaScript"};
		HashSet<String> hs= new HashSet<String>();
		for(String name:names) {
			if(hs.add(name)==false) {
				System.out.println("Duplicate word is:"+ name);
			}
		}
 
	}

}
