package add;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =0, sum=0, num,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n= sc.nextInt();
		num =n;
		while(n!=0) {
			 rem=n%10;
			 sum=sum*10+rem;
			 n=n/10;
		}
		
		System.out.println("Reversed number:"+sum);
	
	if(sum==num) {
		System.out.println("Found a Palindrome number: "+sum);
	}else
	{
		System.out.println("Not a Palindrome Number");
	}
}
}