package add;

public class ReplaceCharacterWithOccurrence {
	public static void main(String[] args) {
		
		String str= "Hello World";
		String str1=str.toLowerCase();
		int count = 1;
		char TexttoReplace= 'l';
		
		if(str1.indexOf(TexttoReplace)==-1) {
			System.out.println("No repeating character ::");
			System.exit(0);
		}
		
		for(int i=0;i<str1.length();i++) {
		char ch=str1.charAt(i);
			if(ch==TexttoReplace) {
			str1 = str1.replaceFirst(String.valueOf(TexttoReplace), String.valueOf(count));
				count++;
			}
		
		}
		System.out.println(str1);
	}

	
	
	
}
