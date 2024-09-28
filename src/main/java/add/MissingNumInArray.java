package add;

import java.util.HashSet;

public class MissingNumInArray {

	public static void main(String[] args) {
		
		int ar[]= {1,2,4,7};
		int max = 7;
		System.out.println("Missing Numbers in the array:");
		findMissingNum(ar,max);

	}

	public static void findMissingNum(int[] ar, int max) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int num:ar) {
			hs.add(num);
		}
		for(int i=1;i<=max;i++) {
			if(!hs.contains(i)) {
				System.out.println(i + "");
			}
		}
		System.out.println();
	}

}
