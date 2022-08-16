package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class UsingTreeSet {
	public static void main(String[]args) {
		int a[]= {1,2,3,3,5,5,6,77,6,};
		
		HashSet<Integer> hs=new HashSet<>();
		try {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]+ " ");
				hs.add(a[i]);
			}
			System.out.println(hs);
		}
			
			catch(Exception e) {
				TreeSet<Integer> sorted=new TreeSet<>(hs);
				System.out.println("sorted array is ");
				
				System.out.println(sorted);
				
				
				
			}
		}
		
		
	}

