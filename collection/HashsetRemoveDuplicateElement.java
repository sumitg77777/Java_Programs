package collection;

import java.util.HashSet;

public class HashsetRemoveDuplicateElement {
	public static void main (String[]args) {
		int[] arr= {10,20,80,2,3,3,4};
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		
	}
	for(int no:hs)
	{
		System.out.print(no+ " ");
	}

}
}
