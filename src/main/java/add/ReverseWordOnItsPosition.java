package add;

public class ReverseWordOnItsPosition {

	public static void main(String[] args) {
	
		String str="java code";
	
		String output= "";
		
		String[] words=str.split(" ");
		
		System.out.println("Original string ::" +str);
		
	
		for(String word:words) {
			
			String rev= "";
			 
		for(int i=word.length()-1;i>=0;i--) {
			
			rev=rev+word.charAt(i);
		}
		output=output+rev+" ";
	}
	
		System.out.println("Reversed string ::"+output);			
	
	}
	
}
