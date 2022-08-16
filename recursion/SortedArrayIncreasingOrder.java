package recursion;

public class SortedArrayIncreasingOrder {
	public static boolean issorted(int arr[],int indx) {
		if(indx== arr.length-1) {
			return true;
		}
		if(arr[indx]<arr[indx+1]) {
			return true;
		}
		else{
			 return false;
		}
		
	}
	
	
	public static void main (String[]args) {
		int arr[]= {1,3,5,7};
		//issorted(arr.length,0);
		System.out.println(issorted(arr,0));
		
	}

}
