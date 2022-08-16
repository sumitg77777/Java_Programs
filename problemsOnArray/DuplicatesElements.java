package problemsOnArray;

public class DuplicatesElements {
	public static void main (String[]args) {
		int arr[]= {10,20,30,20,10,30,40,50};
		
		for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.print(arr[j]+" ");
				
			}
			//System.out.println();
		}
		}
	}

}
