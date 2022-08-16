package problemsOnArray;

public class SecondLargestElement {
	public static int getsecondlargest(int arr[],int k) {
		for(int i=0;i<k;i++) {
			for(int j=i+1;j<k;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
				
		}
		return arr[k-2];
	}

	public static void main (String[]args) {
		int arr[]= {20,30,10,50,70,35};
		int arr1[]= {100,400,300,500,200};
		System.out.println(getsecondlargest(arr,6));
		System.out.println(getsecondlargest(arr1,5));
		
		
	}
	

}

