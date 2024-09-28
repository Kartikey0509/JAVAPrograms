package add;

import java.util.Arrays;

public class SmallestAndLargestNumInArray {

	public static void main(String[] args) {
	
		int num[]= {1,-1,-10,99,108,100,2,5};
		int largest=num[0];
	
		int smallest=num[0]; 
		
		for(int i=1;i<num.length;i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
			else if(num[i]<smallest) { 
				smallest=num[i];
			}
		}
		System.out.println("\n Given array ::"+ Arrays.toString(num));
		System.out.println("Largest number is::"+largest);
		System.out.println("Smallest number is::"+smallest);
	}

}
