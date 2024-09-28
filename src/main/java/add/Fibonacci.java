package add;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// First use loop then add two numbers and then swap
		int num1=0, num2=1, sum, count;
		System.out.println("Entered first & second number:" + num1 + " "+ num2);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count to find Fibonacci series till");
		count = sc.nextInt();
		for(int i=2;i<count;++i) {
			sum= num1+num2;
			System.out.println("Fabonacci series is : "+sum );
			num1 =num2;
			num2=sum;
					
		}

	}

}
