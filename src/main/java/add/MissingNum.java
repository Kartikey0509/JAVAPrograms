package add;

import java.util.HashSet;

public class MissingNum { 
	public static void main(String[] args) {
		 int arr[]= {1,2,3,10};
		   int max=10;
		   System.out.println("---Find the Missing Num:---");
		   findMissNum(arr,max);
	}

		public static void findMissNum(int[] arr, int max) {
		HashSet<Integer>hs=new HashSet<Integer>();
		for(int num:arr) {
			hs.add(num);
		} 
		for(int i=1;i<max;i++) {
			if(!hs.contains(i)) {
				System.out.println(i+"");
			}
		}
		System.out.println();
	}
}
  