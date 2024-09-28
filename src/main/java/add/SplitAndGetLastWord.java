package add;

public class SplitAndGetLastWord {


	public static void main(String[] args) {
	    int length = 0;
	
		    String s= "picture perfect";
		        s = s.trim();
		        
		        for (int i = s.length() - 1; i >= 0; i--) {
		            if (s.charAt(i) != ' ') {
		                length++;
		            }
		            else if (length > 0) {
		                break;
		            }
		        }
		        
		        System.out.println("Length is--"+length);
		    }
		

	}


