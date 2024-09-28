package add;

public class RevStringKeepingPositionPreserved {
	
	static void revString(String input) {
		char[] inputArr=input.toCharArray();   // Convert to char array
		char[] result= new char[inputArr.length]; // char array to store
		
		for(int i=0; i<inputArr.length; i++) {
			if(inputArr[i]==' ') {
				result[i] = ' ';
			}
		}
		int j= result.length-1;
		for(int i=0; i<inputArr.length; i++) {
			if(inputArr[i]!= ' ') { 
				if(result[j]==' ') {
					j--;
				}
				result[j] = inputArr[i];
				j--;
			}
		}
		System.out.println(input+ "--->"+String.valueOf(result));
	}

	public static void main(String[] args) {
		
		revString("India is my country");

	}

}
