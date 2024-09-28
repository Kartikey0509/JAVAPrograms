package add;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
	
		String str;
		String rev="";
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		

	
	if(str.equals(rev)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}

	}}
