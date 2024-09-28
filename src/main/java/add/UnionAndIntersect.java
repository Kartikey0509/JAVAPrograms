package add;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class UnionAndIntersect {

	public static void main(String[] args) {
			
	int	arr1[] = {7, 1, 5, 2, 3, 6} ; 
	
	int	arr2[] = {3, 8, 6, 20, 7,6,6,6,6};
	
	
	
	System.out.println("Union of two arrays is : ");
	getUnion(arr1,arr2);
		System.out.println();
	   System.out.println("Intersection of two arrays is : ");
	getIntersection(arr1,arr2);
	 

	}
	
	public static void getIntersection(int[] arr1, int[] arr2) {
		
		int n=arr1.length;
		int m=  arr2.length;
	
		LinkedHashSet<Integer>hs= new LinkedHashSet<Integer>();
		
		for(int i=0; i<n; i++) 
			hs.add(arr1[i]);
		
		for(int i=0;i<m;i++) 
			if(hs.contains(arr2[i])) {
				
				System.out.print(arr2[i]+ " ");

	  }
		 System.out.println();
	}
		
			
		
	
	public static void getUnion(int[] arr1, int[] arr2) {
	
		int n=arr1.length;
		int m=  arr2.length;
		
		TreeSet<Integer>al= new TreeSet<Integer>();
		
		for(int i=0; i<n; i++) 
			al.add(arr1[i]);
		
		for(int i=0;i<m;i++) 
			al.add(arr2[i]);
		
		
		System.out.print(al);
			
		}
		
}





