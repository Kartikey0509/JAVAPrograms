package add;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if(isArmstrong(n)) {
			System.out.println(n + " is an Armstrong number");
		}
		else {
			System.out.println(n+ " is not an Armstrong number");
		}
	}

	public static boolean isArmstrong(int num) {
		
		int sum=0, last =0, digits = 0, temp;
		temp=num;
		while(temp>0) {
		temp=temp/10;
			digits++;
		}
		temp=num;
		while(temp>0) {
			last=temp%10;
			sum+=(Math.pow(last,digits));
			temp=temp/10;
			
		}
		if(num==sum) {
			return true;
		}else {
			return false;
		}
		
	}

}
