package add;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m, flag=0;
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		m=n/2;    //Num divided for iteration count limit in loop
		// Main Logic
		if(n<=1) {  //Num checked, it shouldn't be 0 or 1
			System.out.println(n+" is not a prime number");
		}
		else {
			
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					
					System.out.println(n+" is not a prime number");
					flag=1;
					break;
				}
				
			}
			if(flag==0) {
				System.out.println(n+" is a prime number");
			}
		}

	}

}
