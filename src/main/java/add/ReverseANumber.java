package add;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int n = 0, rem = 0;
		int sum = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to be reversed:" );
		n=sc.nextInt();
	
		while(n!=0) {
			
			rem= n%10; //1 2
			sum = sum*10+ rem;//1  2
			n= n/10; //12
			
		}
		System.out.println("Reversed Number is :" +sum);

	}

}
