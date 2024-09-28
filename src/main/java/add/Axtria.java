package add;

public class Axtria {

	public static void main(String[] args) {
		String str= "AUTOMATION";
		
		char vowels=' ';
		String rev="";

		for(int i=str.length()-1;i>=0;i--){
			
			if(str.charAt(i)=='A'|| str.charAt(i)=='E' || str.charAt(i)=='O' || str.charAt(i)=='U' ) 
				System.out.print("Vowel found");
			rev=rev+str.charAt(i);
		}
		System.out.println("\n"+rev);
		System.out.println(rev.toLowerCase());
		

	}

}
